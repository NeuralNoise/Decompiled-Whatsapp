package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ari implements OnClickListener {
    final VerifySms a;
    final int b;

    ari(VerifySms verifySms, int i) {
        this.a = verifySms;
        this.b = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(this.b);
        VerifySms.t(this.a);
    }
}
