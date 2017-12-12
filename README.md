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
```Java
  <com.allen.autowraplinearlayout.view.AutoWrapLinearLayout
        android:id="@+id/auto_linear"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="15dp" />

```

