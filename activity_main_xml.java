<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFEEC"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/idJogador1"
        android:layout_width="240dp"
        android:layout_height="56dp"
        android:ems="10"
        android:hint="Jogador 1"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.45" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="141dp"
        android:layout_height="53dp"
        android:text="Jokenpo"
        android:textSize="34sp"
        android:textStyle="italic"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.343" />

    <EditText
        android:id="@+id/idJogador2"
        android:layout_width="240dp"
        android:layout_height="56dp"
        android:ems="10"
        android:hint="Jogador 2"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.552" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="226dp"
        android:layout_height="54dp"
        android:text="BEM VINDOS"
        android:textSize="38sp"
        android:textStyle="normal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.265" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="389dp"
        android:layout_height="176dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.028"
        app:srcCompat="@drawable/jokenpo" />

    <Button
        android:id="@+id/buttonComecar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="Jogar"
        android:text="Começar"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.476"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.642" />

    <ImageView
        android:id="@+id/idImg2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.762"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.889"
        app:srcCompat="@drawable/ic_launcher_foreground" />

    <ImageView
        android:id="@+id/idImg1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.217"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.889"
        app:srcCompat="@drawable/ic_launcher_foreground" />

    <TextView
        android:id="@+id/idVencedor"
        android:layout_width="329dp"
        android:layout_height="44dp"
        android:text="Vencedor é: "
        android:textAlignment="center"
        android:textSize="25sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.503"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.744" />

    <TextView
        android:id="@+id/idNomeJogador1"
        android:layout_width="87dp"
        android:layout_height="27dp"
        android:text="Jog 1: "
        android:textAlignment="center"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.253"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.967" />

    <TextView
        android:id="@+id/idNomeJogador2"
        android:layout_width="108dp"
        android:layout_height="24dp"
        android:text="Jog 2: "
        android:textAlignment="center"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.743"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.966" />
</androidx.constraintlayout.widget.ConstraintLayout>
