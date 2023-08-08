package com.example.application.views.book;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Book")
@Route(value = "book", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class BookView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private DateTimePicker dateTimePicker = new DateTimePicker();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private ComboBox comboBox = new ComboBox();

    private TextField textField = new TextField();

    private TextField textField2 = new TextField();

    private TextField textField3 = new TextField();

    private TextArea textArea = new TextArea();

    private ProgressBar progressBar = new ProgressBar();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    public BookView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setHeightFull();
        layoutColumn3.setWidth(null);
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setHeightFull();
        layoutColumn2.setWidth(null);
        dateTimePicker.setLabel("Date time picker");
        layoutRow2.addClassName(Gap.SMALL);
        comboBox.setLabel("Combo Box");
        setComboBoxSampleData(comboBox);
        textField.setLabel("Text field");
        textField2.setLabel("Text field");
        textField3.setLabel("Text field");
        textArea.setLabel("Text area");
        progressBar.setValue(0.5);
        layoutRow.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setHeightFull();
        layoutColumn4.setWidth(null);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn3);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(dateTimePicker);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(comboBox);
        layoutRow2.add(textField);
        layoutColumn2.add(textField2);
        layoutColumn2.add(textField3);
        layoutColumn2.add(textArea);
        layoutColumn2.add(progressBar);
        layoutRow.add(layoutColumn4);
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        comboBox.setItems("First", "Second", "Third", "Fourth");
    }
}
