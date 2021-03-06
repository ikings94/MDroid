package in.co.praveenkumar.mdroid.dialog;

import in.co.praveenkumar.R;
import in.co.praveenkumar.mdroid.activity.CourseActivity.DialogActionListener;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class PlaygamesDialog extends Dialog implements
		android.view.View.OnClickListener {
	DialogActionListener dialogListener;

	public PlaygamesDialog(Context context) {
		super(context);
	}

	public PlaygamesDialog(Context context,
			DialogActionListener dialogListener) {
		super(context);
		this.dialogListener = dialogListener;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_playservices);
		getWindow().setBackgroundDrawable(
				new ColorDrawable(android.graphics.Color.TRANSPARENT));
		findViewById(R.id.dialog_playgames_connect).setOnClickListener(this);
		findViewById(R.id.dialog_playgames_later).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.dialog_playgames_connect)
			dialogListener.doAction(DialogActionListener.CONNECT_PLAYGAMES);
		if (v.getId() == R.id.dialog_playgames_later)
			dialogListener.doAction(DialogActionListener.CANCEL);
	}

}
