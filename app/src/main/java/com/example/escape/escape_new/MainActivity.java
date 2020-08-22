package com.example.escape.escape_new;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    int n6 = 0;

    int pass1 = 0;
    int pass2 = 0;
    int pass3 = 0;
    int pass4 = 0;
    int pass5 = 0;
    int pass6 = 0;
    int pass7 = 0;
    int pass8 = 0;
    int pass9 = 0;
    int intpick = 0;
    int foodval = 0; //判斷轉哪張雞舍用
    int count = 0;
    boolean blox = true; //判斷轉哪張牛舍圖用

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jumproom();
    }

    //region房間頭
    public void jumproom() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_main);
        //region右側面板按鈕FIND
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final ImageButton right = (ImageButton) findViewById(R.id.right);
        final ImageButton left = (ImageButton) findViewById(R.id.left);
        final TextView log = (TextView) findViewById(R.id.log);
        //endregion
        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion

        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        final Button pillow = (Button) findViewById(R.id.pillow);//枕頭按鈕進特寫
        final Button bed = (Button) findViewById(R.id.bed);//床 只是一張床
        final Button ref = (Button) findViewById(R.id.ref);//開冰箱按鈕
        final Button ref_1 = (Button) findViewById(R.id.ref_1);//冰箱上面的按鈕
        final Button tv = (Button) findViewById(R.id.tv);//開電視畫面
        final Button pwdbox = (Button) findViewById(R.id.pwdbox);//進鎖畫面
        final Button not = (Button) findViewById(R.id.not);//甚麼都沒有按鈕
        final Button btbook = (Button) findViewById(R.id.btbook);//書按鈕
        final Button door = (Button) findViewById(R.id.door);//門

        //region亂按按鈕
        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, " 什麼都沒有，別一直亂按", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        //endregion
        //region床
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, " 是我昨天睡的地方，上面有一個枕頭", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        //endregion
        //region冰箱上面按鈕
        ref_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, " 只 是 一 個 冰 箱 ， 好 像 可 以 開 ", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        //endregion
        //region 書
        btbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });
        //endregion
        //region 保險箱畫面
        pwdbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n3 != 1) {
                    jumppwdbox();
                } else {
                    Toast test = Toast.makeText(MainActivity.this, "箱子開過了 ", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();

                }
            }
        });
//endregion
        //region找遙控器
        pillow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n4 != 1) {
                    checkcont();
                } else {
                    Toast test = Toast.makeText(MainActivity.this, "這裡找過囉，沒有東西了喔~", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            }
        });
        //endregion
        //region 撿冰箱紙片畫面
        ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n2 != 1) {
                    ref();
                } else {
                    Toast test = Toast.makeText(MainActivity.this, " 已經找過了 ", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            }
        });
//endregion
        //region 電視
        if (n6 == 1) {
            tv.setVisibility(tv.INVISIBLE);
        } else {
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    opentv();
                }
            });
        }

        //endregion
        //region右轉牛舍
        if (blox != false) {
            right.setOnClickListener(new ImageButton.OnClickListener() {
                public void onClick(View v) {
                    jumpcow();
                }
            });
        } else {
            right.setOnClickListener(new ImageButton.OnClickListener() {
                public void onClick(View v) {
                    jumpcow2();
                }
            });
        }
        //endregion
        //region 左轉
        left.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //0跳沒裝滿 1跳裝滿
                        if (foodval == 0) {
                            jumpchicken();
                        } else {
                            jumpchicken1();
                        }

                    }
                });
        //endregion
        //region門
        door.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n6 != 1) {
                    Toast test = Toast.makeText(MainActivity.this, " 沒鑰匙打不開啊!!!!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            }
        });
        //endregion
        if (n6 == 1) {
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    door.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast test = Toast.makeText(MainActivity.this, " 終於可以離開了！", Toast.LENGTH_SHORT);
                            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                            test.show();

                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this, finish.class);
                            startActivity(intent);
                            MainActivity.this.finish();
                        }
                    });
                }
            });
        }
    }


    //region書
    public void book() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.book);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);
        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final ImageView openbook = (ImageView) findViewById(R.id.openbook);
        final Button btopen = (Button) findViewById(R.id.btopen);
        final ImageView book = (ImageView) findViewById(R.id.book);
        final Button pick = (Button) findViewById(R.id.pick);
        final ImageView imgpick = (ImageView) findViewById(R.id.imgpick);
        btopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book.setVisibility(book.INVISIBLE);
                openbook.setVisibility(openbook.VISIBLE);
                btopen.setVisibility(View.INVISIBLE);
                if (intpick == 0) {
                    Toast test1 = Toast.makeText(MainActivity.this, " 書破了一角", Toast.LENGTH_SHORT);
                    test1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test1.show();
                }
                if (n1 == 1 && intpick == 0) {
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            pick.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imgpick.setVisibility(imgpick.VISIBLE);
                                    pick.setEnabled(false);
                                    Toast test = Toast.makeText(MainActivity.this, "轉了一下剛好可以放上去，圖形好像可以用在哪裡", Toast.LENGTH_SHORT);
                                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                                    test.show();
                                    intpick = 1;
                                    b1.setVisibility(b1.INVISIBLE);
                                    n1 = 2;
                                }
                            });
                        }
                    });
                }
                if (intpick == 1) {
                    book.setVisibility(View.INVISIBLE);
                    openbook.setVisibility(View.VISIBLE);
                    imgpick.setVisibility(View.VISIBLE);
                    Toast test2 = Toast.makeText(MainActivity.this, " 書上好像是什麼密碼", Toast.LENGTH_SHORT);
                    test2.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test2.show();
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumproom();
            }
        });

    }

    //endregion
    //region密碼箱
    public void jumppwdbox() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.checkbox);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final Button btbrush = (Button) findViewById(R.id.btbrush);
        final Button ok = (Button) findViewById(R.id.ok);

        final ImageView brush = (ImageView) findViewById(R.id.brush);
        final ToggleButton tob1 = (ToggleButton) findViewById(R.id.tob1);
        final ToggleButton tob2 = (ToggleButton) findViewById(R.id.tob2);
        final ToggleButton tob3 = (ToggleButton) findViewById(R.id.tob3);
        final ToggleButton tob4 = (ToggleButton) findViewById(R.id.tob4);
        final ToggleButton tob5 = (ToggleButton) findViewById(R.id.tob6);
        final ToggleButton tob6 = (ToggleButton) findViewById(R.id.tob6);
        final ToggleButton tob7 = (ToggleButton) findViewById(R.id.tob7);
        final ToggleButton tob8 = (ToggleButton) findViewById(R.id.tob8);
        final ToggleButton tob9 = (ToggleButton) findViewById(R.id.tob9);

        pass1 = 0;
        pass2 = 0;
        pass3 = 0;
        pass4 = 0;
        pass5 = 0;
        pass6 = 0;
        pass7 = 0;
        pass8 = 0;
        pass9 = 0;

        tob1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass1 = 1;
            }
        });
        tob2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass2 = 1;
            }
        });
        tob3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass3 = 1;
            }
        });
        tob4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass4 = 1;
            }
        });
        tob5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass5 = 1;
            }
        });
        tob6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass6 = 1;
            }
        });
        tob7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass7 = 1;
            }
        });
        tob8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass8 = 1;
            }
        });
        tob9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pass9 = 1;
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pass1 == 1 && pass4 == 1 && pass6 == 1 && pass8 == 1 && pass2 == 0 && pass3 == 0 && pass5 == 0 && pass7 == 0 && pass9 == 0) {
                    Toast test = Toast.makeText(MainActivity.this, " 箱 子 打 開 了 ", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                    brush.setVisibility(brush.VISIBLE);
                    btbrush.setVisibility(btbrush.VISIBLE);
                    n3 = 1;
                    btbrush.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b3.setVisibility(b3.VISIBLE);
                            brush.setVisibility(View.INVISIBLE);
                            btbrush.setVisibility(View.INVISIBLE);
                            jumproom();
                        }
                    });
                } else {
                    Toast test = Toast.makeText(MainActivity.this, " 好 像 沒 反 應", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            }
        });
        exit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                jumproom();
            }
        });

    }

    //endregion
    //region 開電視
    public void opentv() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.opentv);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion
        final Button open = (Button) findViewById(R.id.open);
        final ImageView quen = (ImageView) findViewById(R.id.quen);
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        Toast test = Toast.makeText(MainActivity.this, "電視關起來了", Toast.LENGTH_SHORT);
        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        test.show();
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    open.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            quen.setVisibility(quen.VISIBLE);
                            Toast test = Toast.makeText(MainActivity.this, "電視被打開了....好像是推理題目", Toast.LENGTH_SHORT);
                            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                            test.show();
                        }
                    });
                }
            });
        }
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumproom();
            }
        });
    }

    //endregion
    //region 撿冰箱紙片
    public void ref() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.refpick);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final Button pick = (Button) findViewById(R.id.pick);
        final ImageView finish = (ImageView) findViewById(R.id.refpick);
        Toast test = Toast.makeText(MainActivity.this, "從冰箱的夾縫中調出了一張不知道是什麼的紙", Toast.LENGTH_SHORT);
        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        test.show();
        pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2 = 1;
                if (n2 == 1) {
                    finish.setVisibility(finish.VISIBLE);
                    b2.setVisibility(b2.VISIBLE);
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumproom();
            }
        });
    }//endregion

    //region 撿遙控器
    public void checkcont() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.jumpcheckcont);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);
        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion
        final Button btcont = (Button) findViewById(R.id.btcont);
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final ImageView nof = (ImageView) findViewById(R.id.nof);

        btcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n4 = 1;
                b4.setVisibility(b4.VISIBLE);
                nof.setVisibility(nof.VISIBLE);
                btcont.setVisibility(btcont.INVISIBLE);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumproom();
            }
        });

    }
//endregion

//endregion房間尾

    //region牛舍頭

    //region牛舍_在佈告欄前
    public void jumpcow() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_cow);
        //region右側面板按鈕FIND
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final ImageButton right = (ImageButton) findViewById(R.id.right);
        final ImageButton left = (ImageButton) findViewById(R.id.left);
        final TextView log = (TextView) findViewById(R.id.log);
        final Button grass = (Button) findViewById(R.id.btgrass);
        final Button ox = (Button) findViewById(R.id.btox);
        final Button notice = (Button) findViewById(R.id.nnotice);
        //endregion

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        //region進入稻草堆
        if (n1 == 0) {
            grass.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    jumpgrass();
                }
            });
        }
        //endregion

        //region牛牛
        ox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "牛擋在前面死都不走，感覺身體有點髒", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast test = Toast.makeText(MainActivity.this, "它好像覺得很舒服，走去喝水了。", Toast.LENGTH_SHORT);
                        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                        test.show();
                        ox.setVisibility(ox.INVISIBLE);
                        blox = false;
                        jumpcow2();
                    }
                });
            }
        });
        //endregion

        //region佈告欄
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "沒看到被擋住了嗎！", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        //endregion

        //region左右轉
        //右轉雞舍
        right.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //0跳沒裝滿 1跳裝滿
                        if (foodval == 0) {
                            jumpchicken();
                        } else {
                            jumpchicken1();
                        }

                    }
                });
        //左轉房間
        left.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                jumproom();
            }
        });
        //endregion
    }
    //endregion

    //region稻草堆事件
    public void jumpgrass() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_grass);
        //右側面板按鈕FIND
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final Button btpaper = (Button) findViewById(R.id.btpaper);
        final ImageView nopaper = (ImageView) findViewById(R.id.nopaper);
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final ImageView paper = (ImageView) findViewById(R.id.paper_s);
        final TextView log = (TextView) findViewById(R.id.log);

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        Toast test = Toast.makeText(MainActivity.this, "潮濕的稻草堆裡，好像有什麼東西。", Toast.LENGTH_SHORT);
        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        test.show();

        //紙片事件
        btpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btpaper.setVisibility(btpaper.INVISIBLE);
                paper.setVisibility(paper.VISIBLE);
                n1 = 1;
                nopaper.setVisibility(nopaper.VISIBLE);
                Toast test = Toast.makeText(MainActivity.this, "獲得一張紙片，好像是哪本書的一角，也許可以旋轉。", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (blox != false) {
                    jumpcow();
                } else {
                    jumpcow2();
                }
            }
        });
    }
    //endregion

    //region牛舍_喝水去
    public void jumpcow2() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_cow2);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final ImageButton right = (ImageButton) findViewById(R.id.right);
        final ImageButton left = (ImageButton) findViewById(R.id.left);
        final ImageView cowhouse = (ImageView) findViewById(R.id.cowhouse2);
        final ImageView cowhouse2 = (ImageView) findViewById(R.id.cowhouse3);
        final Button grass = (Button) findViewById(R.id.btgrass);
        final Button wox = (Button) findViewById(R.id.wox);
        final Button notice = (Button) findViewById(R.id.notice);
        final Button sudoku = (Button) findViewById(R.id.sudoku);
        final TextView log = (TextView) findViewById(R.id.log);


        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        //region進入稻草堆
        if (n1 == 0) {
            grass.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    jumpgrass();
                }
            });
        }
        //endregion

        //region牛牛
        wox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "不要打擾人家喝水啦。", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        //endregion

        //region左右轉
        //右轉雞舍
        right.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //0跳沒裝滿 1跳裝滿
                        if (foodval == 0) {
                            jumpchicken();
                        } else {
                            jumpchicken1();
                        }

                    }
                });
        //左轉牛舍
        left.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                jumproom();
            }
        });
        //endregion

        //region佈告欄事件
        if (n5 == 0) {
            notice.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Toast test = Toast.makeText(MainActivity.this, "咦它、它掉下來了！！！！", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                    cowhouse.setVisibility(cowhouse.INVISIBLE);
                    cowhouse2.setVisibility(cowhouse2.VISIBLE);
                    notice.setVisibility(notice.INVISIBLE);
                    sudoku.setVisibility(sudoku.VISIBLE);
                }
            });
        } else {
            cowhouse2.setVisibility(cowhouse2.VISIBLE);
            notice.setVisibility(notice.INVISIBLE);
            sudoku.setVisibility(sudoku.VISIBLE);
        }
        if (n5 == 0) {
            sudoku.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    jumpsudoku();
                }
            });
        } else {
            sudoku.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast test = Toast.makeText(MainActivity.this, "就說沒時間了！不要再玩這傷腦的遊戲！！", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }

        //endregion
    }
    //endregion

    //region數獨事件
    public void jumpsudoku() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_sudoku);
        //右側面板按鈕FIND
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final EditText password = (EditText) findViewById(R.id.password);
        final Button enter = (Button) findViewById(R.id.enter);
        final ImageView chickenfood = (ImageView) findViewById(R.id.chickenfood);
        final Button btchickenfood = (Button) findViewById(R.id.btchickfood);
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final TextView log = (TextView) findViewById(R.id.log);

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        Toast test = Toast.makeText(MainActivity.this, "應該是按紅色按鈕確認吧。", Toast.LENGTH_SHORT);
        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        test.show();

        //紅色按鈕判斷
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 2) {
                    if (password.getText().toString().equals("4")) {
                        Toast test = Toast.makeText(MainActivity.this, "答對#", Toast.LENGTH_SHORT);
                        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                        test.show();
                        enter.setVisibility(enter.INVISIBLE);
                        chickenfood.setVisibility(chickenfood.VISIBLE);
                        btchickenfood.setVisibility(btchickenfood.VISIBLE);
                        n5 = 1;
                    } else {
                        Toast test = Toast.makeText(MainActivity.this, "錯了，還剩下" + (2 - count) + "次。(即將GAMEOVER)", Toast.LENGTH_SHORT);
                        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                        test.show();
                        count++;
                    }
                } else {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Activity_gameover.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                jumpcow2();
            }
        });
    }
    //endregion

//endregion牛舍尾

    //region雞舍頭

    //region沒飼料的雞#
    public void jumpchicken() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.chicken);
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final ImageButton right = (ImageButton) findViewById(R.id.right);
        final ImageButton left = (ImageButton) findViewById(R.id.left);
        final TextView log = (TextView) findViewById(R.id.log);

        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        final Button click1 = (Button) findViewById(R.id.clickcheck);
        final Button click2 = (Button) findViewById(R.id.clickcheck2);
        final Button coop = (Button) findViewById(R.id.coop);
        final Button food = (Button) findViewById(R.id.food1);
        final ImageView food123 = (ImageView) findViewById(R.id.food123);
        if (foodval == 1) {
            food123.setVisibility(View.VISIBLE);
        }
        //region 雞按鈕
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "雞窩下好像有甚麼東西...可是牠壓在上面", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "雞正在睡覺...", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        coop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "不知道是甚麼東西被雞窩蓋著....", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foodval != 1) {
                    jumpbasin();
                } else {
                    Toast test = Toast.makeText(MainActivity.this, "飼料已經放好了，就別再動了。", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            }
        });
        //endregion
        //region右轉房間
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumproom();
            }
        });
        //endregion
        //region左轉牛舍
        if (blox != false) {
            left.setOnClickListener(new ImageButton.OnClickListener() {
                public void onClick(View v) {
                    jumpcow();
                }
            });
        } else {
            left.setOnClickListener(new ImageButton.OnClickListener() {
                public void onClick(View v) {
                    jumpcow2();
                }
            });
        }
        //endregion
    }
    //endregion
    //region雞盆盆
    public void jumpbasin() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.chickfood_1);
        //region右側面板
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);
        //endregion
        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }
        //endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion
        final ImageView foodbox = (ImageView) findViewById(R.id.foodbox);
        final ImageView havefood3 = (ImageView) findViewById(R.id.havefood3);
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final Button givefood = (Button) findViewById(R.id.givefood);

        Toast test = Toast.makeText(MainActivity.this, "飼料盆空空的....或許放滿雞就會來吃吧", Toast.LENGTH_SHORT);
        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        test.show();

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                givefood.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast test = Toast.makeText(MainActivity.this, "放下飼料，等一下雞就會來吃了吧", Toast.LENGTH_SHORT);
                        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                        test.show();
                        foodbox.setVisibility(foodbox.INVISIBLE);
                        havefood3.setVisibility(havefood3.VISIBLE);
                        foodval = 1;
                    }
                });
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                jumpchicken();
            }
        });
    }
    //endregion

    //region得到飼料的雞#
    public void jumpchicken1() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.jumpchicken1);
        //region 右側面板
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final ImageButton right = (ImageButton) findViewById(R.id.right);
        final ImageButton left = (ImageButton) findViewById(R.id.left);
        final TextView log = (TextView) findViewById(R.id.log);
        //endregion
        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }//endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        final Button click1 = (Button) findViewById(R.id.clickcheck);
        final Button click2 = (Button) findViewById(R.id.clickcheck2);
        final Button coop = (Button) findViewById(R.id.coop);
        final Button food = (Button) findViewById(R.id.food1);
        final ImageView havefood = (ImageView) findViewById(R.id.havefood);
        final ImageView havebox = (ImageView) findViewById(R.id.havebox);
        final Button btbox2 = (Button) findViewById(R.id.btbox2);

        click1.setEnabled(false);
        click2.setEnabled(false);

        //region放雞飼料#
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast test = Toast.makeText(MainActivity.this, "飼料放滿了。雞正在吃", Toast.LENGTH_SHORT);
                test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                test.show();
            }
        });
        //endregion

        //region雞窩
        coop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n6 == 0) {
                    Toast test = Toast.makeText(MainActivity.this, "把雞窩移開看看，有一個密碼箱...", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                    havebox.setVisibility(View.VISIBLE);
                    btbox2.setVisibility(View.VISIBLE);
                    btbox2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (n6 == 0) {
                                jumpbtbox();
                            }
                        }
                    });
                } else {
                    Toast test = Toast.makeText(MainActivity.this, "鑰匙都拿到了還要搬雞窩幹嘛", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            }
        });

        //region右轉房間
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumproom();
            }
        });
        //endregion
        //region左轉牛舍
        if (blox != false) {
            left.setOnClickListener(new ImageButton.OnClickListener() {
                public void onClick(View v) {
                    jumpcow();
                }
            });
        } else {
            left.setOnClickListener(new ImageButton.OnClickListener() {
                public void onClick(View v) {
                    jumpcow2();
                }
            });
        }
        //endregion
        //endregion
    }
    //endregion

    //region 跳轉雞窩按鈕
    public void jumpbtbox() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.btbox2);
        //
        final EditText pwd = (EditText) findViewById(R.id.textpwd);
        final Button ok1 = (Button) findViewById(R.id.button);
        final ImageButton exit = (ImageButton) findViewById(R.id.exit);
        final ImageView key = (ImageView) findViewById(R.id.imageView4);
        final Button keybt = (Button) findViewById(R.id.button2);

        // region 右側面板
        final ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        final ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        final ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        final ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        final ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        final ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        final TextView log = (TextView) findViewById(R.id.log);
        count = 0;
        //endregion
        //region如果找到該物件則按鈕開啟
        if (n1 == 1) {
            b1.setVisibility(b1.VISIBLE);
        }
        if (n2 != 0) {
            b2.setVisibility(b2.VISIBLE);
        }
        if (n3 != 0) {
            b3.setVisibility(b3.VISIBLE);
        }
        if (n4 != 0) {
            b4.setVisibility(b4.VISIBLE);
        }
        if (n5 != 0) {
            b5.setVisibility(b5.VISIBLE);
        }
        if (n6 != 0) {
            b6.setVisibility(b6.VISIBLE);
        }//endregion
        //region 物件說明
        if (n1 == 1) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("碎片");
                    Toast test = Toast.makeText(MainActivity.this, "好像是某本書的碎片，轉個角度應該可以拚上去", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n2 == 1) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    彈窗跳放大
                    Toast test = Toast.makeText(MainActivity.this, "電視、英文、雞舍....好像是..提示?!", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n3 == 1) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("刷子");
                    Toast test = Toast.makeText(MainActivity.this, "大概是拿來刷動物的吧，畢竟這裡是農場", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });


        }
        if (n4 == 1) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("遙控器");
                }
            });
        }
        if (n5 == 1) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    log.setText("雞飼料");

                    Toast test = Toast.makeText(MainActivity.this, "用來餵雞，應該不是人吃的", Toast.LENGTH_SHORT);
                    test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    test.show();
                }
            });
        }
        if (n6 == 1) {
            log.setText("鑰匙");
            Toast test = Toast.makeText(MainActivity.this, "都拿到鑰匙了，還是快點開門離開吧，免得房子倒了", Toast.LENGTH_SHORT);
            test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            test.show();
        }
        //endregion

        //region 檢測密碼
        ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 2) {
                    if (pwd.getText().toString().equals("Germany")) {
                        ok1.setVisibility(View.INVISIBLE);
                        key.setVisibility(View.VISIBLE);
                        keybt.setVisibility(View.VISIBLE);
                        keybt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                n6 = 1;
                                b6.setVisibility(View.VISIBLE);
                                key.setVisibility(View.INVISIBLE);
                                keybt.setVisibility(View.INVISIBLE);
                                jumpchicken1();
                            }
                        });

                    } else {
                        Toast test = Toast.makeText(MainActivity.this, "錯了，還剩下" + (2 - count) + "次。(即將GAMEOVER)", Toast.LENGTH_SHORT);
                        test.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                        test.show();
                        count++;
                    }
                } else {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Activity_gameover.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                }

            }
        });
        //endregion
        //region 離開
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpchicken1();
            }
        });
        //endregion
    }
    //endregion

    //endregion雞舍尾


}
