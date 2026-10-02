package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FormElementTest {

    @Test
    public void testConstructor_validParameters_createsInstance() {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        attributes.put("action", "http://example.com/submit");
        FormElement form = new FormElement(tag, "http://example.com", attributes);

        Assert.assertNotNull(form);
        Assert.assertEquals("http://example.com/submit", form.attr("action"));
        Assert.assertEquals("http://example.com", form.baseUri());
        Assert.assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testElements_emptyForm_returnsEmptyList() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Elements elements = form.elements();
        Assert.assertNotNull(elements);
        Assert.assertEquals(0, elements.size());
    }

    @Test
    public void testAddElement_addSingleAndMultipleElements_returnsElementsInOrder() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input1 = new Element(Tag.valueOf("input"), "").attr("name", "user").attr("value", "alice");
        Element input2 = new Element(Tag.valueOf("input"), "").attr("name", "pass").attr("value", "secret");

        FormElement chained = form.addElement(input1).addElement(input2);

        Assert.assertSame(form, chained);
        Assert.assertEquals(2, form.elements().size());
        Assert.assertSame(input1, form.elements().get(0));
        Assert.assertSame(input2, form.elements().get(1));
    }

    @Test
    public void testRemoveChild_elementInFormControls_removesFromElementsAndDom() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "").attr("name", "user");
        form.appendChild(input);
        form.addElement(input);

        Assert.assertEquals(1, form.childNodeSize());
        Assert.assertEquals(1, form.elements().size());

        form.removeChild(input);

        Assert.assertEquals(0, form.childNodeSize());
        Assert.assertEquals(0, form.elements().size());
    }

    @Test
    public void testFormData_textInput_returnsKeyVal() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "").attr("name", "username").attr("value", "john_doe");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(1, data.size());
        Assert.assertEquals("username", data.get(0).key());
        Assert.assertEquals("john_doe", data.get(0).value());
    }

    @Test
    public void testFormData_nonSubmittableTag_ignored() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "").attr("name", "container").attr("value", "val");
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_disabledInput_ignored() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "")
                .attr("name", "user")
                .attr("value", "admin")
                .attr("disabled", "");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_inputWithoutName_ignored() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element inputNoName = new Element(Tag.valueOf("input"), "").attr("value", "unnamed");
        Element inputEmptyName = new Element(Tag.valueOf("input"), "").attr("name", "").attr("value", "unnamed2");
        form.addElement(inputNoName);
        form.addElement(inputEmptyName);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_selectWithSelectedOptions_returnsSelectedValues() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "").attr("name", "colors");

        Element opt1 = new Element(Tag.valueOf("option"), "").attr("value", "red");
        Element opt2 = new Element(Tag.valueOf("option"), "").attr("value", "green").attr("selected", "");
        Element opt3 = new Element(Tag.valueOf("option"), "").attr("value", "blue").attr("selected", "");

        select.appendChild(opt1);
        select.appendChild(opt2);
        select.appendChild(opt3);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(2, data.size());
        Assert.assertEquals("colors", data.get(0).key());
        Assert.assertEquals("green", data.get(0).value());
        Assert.assertEquals("colors", data.get(1).key());
        Assert.assertEquals("blue", data.get(1).value());
    }

    @Test
    public void testFormData_selectWithoutSelectedOption_returnsFirstOptionValue() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "").attr("name", "fruit");

        Element opt1 = new Element(Tag.valueOf("option"), "").attr("value", "apple");
        Element opt2 = new Element(Tag.valueOf("option"), "").attr("value", "banana");

        select.appendChild(opt1);
        select.appendChild(opt2);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(1, data.size());
        Assert.assertEquals("fruit", data.get(0).key());
        Assert.assertEquals("apple", data.get(0).value());
    }

    @Test
    public void testFormData_selectWithoutAnyOptions_returnsNothing() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "").attr("name", "emptySelect");
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_checkboxAndRadio_checkedAndUnchecked() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());

        Element cbCheckedWithValue = new Element(Tag.valueOf("input"), "")
                .attr("type", "checkbox")
                .attr("name", "subscribe")
                .attr("value", "newsletter")
                .attr("checked", "");
        Element cbCheckedWithoutValue = new Element(Tag.valueOf("input"), "")
                .attr("type", "checkbox")
                .attr("name", "agree")
                .attr("checked", "");
        Element cbUnchecked = new Element(Tag.valueOf("input"), "")
                .attr("type", "checkbox")
                .attr("name", "extra")
                .attr("value", "yes");

        Element radioChecked = new Element(Tag.valueOf("input"), "")
                .attr("type", "RADIO")
                .attr("name", "gender")
                .attr("value", "female")
                .attr("checked", "");
        Element radioUnchecked = new Element(Tag.valueOf("input"), "")
                .attr("type", "RADIO")
                .attr("name", "gender")
                .attr("value", "male");

        form.addElement(cbCheckedWithValue);
        form.addElement(cbCheckedWithoutValue);
        form.addElement(cbUnchecked);
        form.addElement(radioChecked);
        form.addElement(radioUnchecked);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(3, data.size());
        Assert.assertEquals("subscribe", data.get(0).key());
        Assert.assertEquals("newsletter", data.get(0).value());
        Assert.assertEquals("agree", data.get(1).key());
        Assert.assertEquals("on", data.get(1).value());
        Assert.assertEquals("gender", data.get(2).key());
        Assert.assertEquals("female", data.get(2).value());
    }

    @Test
    public void testFormData_returnsCopy_modifyingReturnedListDoesNotAffectElements() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "").attr("name", "q").attr("value", "jsoup");
        form.addElement(input);

        List<Connection.KeyVal> data1 = form.formData();
        data1.clear();

        List<Connection.KeyVal> data2 = form.formData();
        Assert.assertEquals(1, data2.size());
    }

    @Test
    public void testSubmit_postMethodWithRelativeAction_configuresConnectionCorrectly() {
        Document doc = Jsoup.parse("<form action='/submit' method='POST'><input name='q' value='test'/></form>", "http://example.com/base/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();

        Assert.assertNotNull(con);
        Assert.assertEquals(Connection.Method.POST, con.request().method());
        Assert.assertEquals("http://example.com/submit", con.request().url().toExternalForm());
        Assert.assertEquals(1, con.request().data().size());
        Assert.assertEquals("q", con.request().data().iterator().next().key());
        Assert.assertEquals("test", con.request().data().iterator().next().value());
    }

    @Test
    public void testSubmit_getMethodWithoutAction_usesBaseUri() {
        Document doc = Jsoup.parse("<form method='get'><input name='q' value='test'/></form>", "http://example.com/base/index.html");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();

        Assert.assertNotNull(con);
        Assert.assertEquals(Connection.Method.GET, con.request().method());
        Assert.assertEquals("http://example.com/base/index.html", con.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_emptyActionAndNoBaseUri_throwsIllegalArgumentException() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.submit();
    }
}
