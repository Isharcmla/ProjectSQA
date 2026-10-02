package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    @Test
    public void testConstructor_createStandalone_notNull() {
        Tag tag = Tag.valueOf("form");
        FormElement form = new FormElement(tag, "http://example.com/", new Attributes());
        assertNotNull(form);
        assertEquals("form", form.tagName());
    }

    @Test
    public void testElements_initiallyEmpty_returnsEmptyElements() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testAddElement_addSingleElement_increasesSize() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        FormElement result = form.addElement(input);
        assertSame(form, result);
        assertEquals(1, form.elements().size());
    }

    @Test
    public void testRemoveChild_removeAppendedChild_removesFromElementsList() {
        String html = "<form><input name='test' value='1'></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        assertEquals(1, form.elements().size());
        Element input = form.elements().first();
        input.remove();
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testSubmit_withActionAttributeAndPostMethod_returnsConnection() {
        String html = "<form action='http://example.com/submit' method='post'><input name='name' value='jsoup'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();
        Connection connection = form.submit();
        assertNotNull(connection);
    }

    @Test
    public void testSubmit_withActionAttributeAndGetMethod_returnsConnection() {
        String html = "<form action='http://example.com/submit'><input name='name' value='jsoup'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();
        Connection connection = form.submit();
        assertNotNull(connection);
    }

    @Test
    public void testSubmit_withoutActionButWithBaseUri_returnsConnectionUsingBaseUri() {
        String html = "<form><input name='name' value='jsoup'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();
        Connection connection = form.submit();
        assertNotNull(connection);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_noActionAndNoBaseUri_throwsException() {
        String html = "<form><input name='name' value='jsoup'></form>";
        Document doc = Jsoup.parse(html); // no base uri
        FormElement form = (FormElement) doc.select("form").first();
        form.submit();
    }

    @Test
    public void testFormData_withTextInput_returnsKeyVal() {
        String html = "<form><input name='name' value='jsoup'></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("name", data.get(0).key());
        assertEquals("jsoup", data.get(0).value());
    }

    @Test
    public void testFormData_withDisabledInput_skipsElement() {
        String html = "<form><input name='name' value='jsoup' disabled></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withEmptyName_skipsElement() {
        String html = "<form><input value='jsoup'></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withNonSubmittableTag_skipsElement() {
        String html = "<form></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("name", "divname");
        form.addElement(div);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withSelectAndSelectedOption_returnsSelectedValue() {
        String html = "<form><select name='fruit'><option value='apple'>Apple</option><option value='banana' selected>Banana</option></select></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("fruit", data.get(0).key());
        assertEquals("banana", data.get(0).value());
    }

    @Test
    public void testFormData_withSelectMultipleSelectedOptions_returnsAllSelectedValues() {
        String html = "<form><select name='fruit' multiple><option value='apple' selected>Apple</option><option value='banana' selected>Banana</option></select></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
    }

    @Test
    public void testFormData_withSelectNoSelectedOption_returnsFirstOption() {
        String html = "<form><select name='fruit'><option value='apple'>Apple</option><option value='banana'>Banana</option></select></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("apple", data.get(0).value());
    }

    @Test
    public void testFormData_withSelectNoOptions_returnsEmptyData() {
        String html = "<form><select name='fruit'></select></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withCheckedCheckbox_returnsCheckedValue() {
        String html = "<form><input type='checkbox' name='check' value='yes' checked></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormData_withCheckedCheckboxNoValue_returnsOn() {
        String html = "<form><input type='checkbox' name='check' checked></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testFormData_withUncheckedCheckbox_skipsElement() {
        String html = "<form><input type='checkbox' name='check' value='yes'></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withCheckedRadio_returnsCheckedValue() {
        String html = "<form><input type='radio' name='radio' value='opt1' checked></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("opt1", data.get(0).value());
    }

    @Test
    public void testFormData_withUncheckedRadio_skipsElement() {
        String html = "<form><input type='radio' name='radio' value='opt1'></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withMultipleInputTypes_returnsAllValues() {
        String html = "<form>"
                + "<input type='text' name='text1' value='hello'>"
                + "<input type='hidden' name='hidden1' value='secret'>"
                + "<textarea name='comment'>comment text</textarea>"
                + "</form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
    }

    @Test
    public void testFormData_emptyForm_returnsEmptyList() {
        String html = "<form></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertNotNull(data);
        assertEquals(0, data.size());
    }
}
