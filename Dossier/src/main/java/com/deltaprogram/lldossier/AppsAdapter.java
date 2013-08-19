package com.deltaprogram.lldossier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by realityexpander on 8/18/13.
 */
public class AppsAdapter extends ArrayAdapter<AppsIHaveMade> {

    Context mContext;
    int     mLayoutResourceId;
    AppsIHaveMade   mData[] = null;

    public AppsAdapter(Context context, int layoutResourceId, AppsIHaveMade[] data) {
        super(context, layoutResourceId, data);
        this.mContext = context;
        this.mLayoutResourceId = layoutResourceId;
        this.mData = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        PlaceHolder holder = null;
        if (row == null)
        {
            //Create a new view
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResourceId, parent, false);

            holder = new PlaceHolder();

            holder.appNameView = (TextView) row.findViewById(R.id.app_name);
            holder.appDescriptionView = (TextView) row.findViewById(R.id.app_description);

            row.setTag(holder);
        } else {
            // Use an existing one
            holder = (PlaceHolder) row.getTag();
        }

        // Getting the data from the data array
        AppsIHaveMade appIMade = mData[position];

        // Setting the view to reflect the data we need to display
        holder.appNameView.setText(appIMade.getmAppName());
        holder.appDescriptionView.setText(appIMade.getmAppDescription());
        return row;
    }

    static class PlaceHolder {
        TextView appNameView;
        TextView appDescriptionView;

    }
}
