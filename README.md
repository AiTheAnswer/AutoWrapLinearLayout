# AutoWrapLinearLayout
## 自定义ViewGroup，实现自动换行的LinearLayout
### 效果图
 * 居左  
 * 居中  
 * 居右  
 ![居左](/design/left.jpg)
 ![居中](/design/center.jpg) 
 ![居右](/design/right.jpg)
### 使用方法
 
现在我还不会将jar包放到maven库中，所以不能通过gradle来依赖jar。使用的时候可以将整个项目克隆到本地，然后将View包下的AutoLinearLayout.java复制到你的项目中。  
   
它的使用和其他的ViewGroup使用一样，可以在布局中使用，也可以在代码中添加。  
        
####  1、布局中使用
  
```Java
  <com.allen.autowraplinearlayout.view.AutoWrapLinearLayout
        android:id="@+id/auto_linear"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="15dp" />

```

####  2、代码中设置属性
```Java
        mAutoWrapLinearLayout = (AutoWrapLinearLayout) findViewById(R.id.auto_linear);//绑定控件  
        mAutoWrapLinearLayout.setHorizontalSpace(20);//设置View之间的水平间隔
        mAutoWrapLinearLayout.setVerticalSpace(10);//设置View之间的垂直间隔
        mAutoWrapLinearLayout.isFull(false);//设置是否充满父容器
        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.LEFT);//设置View居左
        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.CENTER);//设置View居中
        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.RIGHT);//设置View居右
        mAutoWrapLinearLayout.addView(view);//添加View
```

