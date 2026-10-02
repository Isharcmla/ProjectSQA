package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class FormElementTest {

    @Test
    public void testConstructor_validInputs_initializesProperly() {
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("id", "myForm");
        FormElement form = new FormElement(tag, "http://example.com/", attrs);

        assertEquals("form", form.tagName());
        assertEquals("http://example.com/", form.baseUri());
        assertEquals("myForm", form.attr("id"));
        assertNotNull(form.elements());
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testAddElement_elementAdded_returnsChainedInstance() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "username");

        FormElement chained = form.addElement(input);

        assertSame(form, chained);
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testElements_directModification_affectsElementsList() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Elements elements = form.elements();
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");

        elements.add(input);

        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testSubmit_withAbsoluteActionAndPostMethod_createsPostConnection() {
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/submit");
        attrs.put("method", "post");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", attrs);

        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "q").attr("value", "jsoup");
        form.addElement(input);

        Connection con = form.submit();

        assertNotNull(con);
        assertEquals(Connection.Method.POST, con.request().method());
        assertEquals("http://example.com/submit", con.request().url().toExternalForm());
        assertEquals(1, con.request().data().size());
        assertEquals("q", con.request().data().iterator().next().key());
        assertEquals("jsoup", con.request().data().iterator().next().value());
    }

    @Test
    public void testSubmit_withRelativeActionAndGetMethod_resolvesUrlAndCreatesGetConnection() {
        Attributes attrs = new Attributes();
        attrs.put("action", "search");
        attrs.put("method", "get");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/app/", attrs);

        Connection con = form.submit();

        assertNotNull(con);
        assertEquals(Connection.Method.GET, con.request().method());
        assertEquals("http://example.com/app/search", con.request().url().toExternalForm());
    }

    @Test
    public void testSubmit_withoutActionAttribute_usesBaseUri() {
        Attributes attrs = new Attributes();
        attrs.put("method", "POST");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/action-target", attrs);

        Connection con = form.submit();

        assertNotNull(con);
        assertEquals(Connection.Method.POST, con.request().method());
        assertEquals("http://example.com/action-target", con.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_emptyActionAndEmptyBaseUri_throwsIllegalArgumentException() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "", attrs);
        form.submit();
    }

    @Test
    public void testFormData_emptyForm_returnsEmptyList() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        List<Connection.KeyVal> data = form.formData();

        assertNotNull(data);
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_nonSubmittableElements_ignored() {
        String html = "<form action='/submit'><div name='div1'>text</div><p name='p1'>para</p></form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        form.addElement(div).addElement(p);

        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_submittableWithoutNameAttribute_ignored() {
        String html = "<form action='/submit'><input type='text' value='noName' /></form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_standardInputAndTextarea_addedSuccessfully() {
        String html = "<form action='/submit'>" +
                "<input type='text' name='user' value='testUser' />" +
                "<input type='hidden' name='token' value='12345' />" +
                "<textarea name='comments'>Some comment</textarea>" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(3, data.size());
        assertEquals("user", data.get(0).key());
        assertEquals("testUser", data.get(0).value());
        assertEquals("token", data.get(1).key());
        assertEquals("12345", data.get(1).value());
        assertEquals("comments", data.get(2).key());
        assertEquals("Some comment", data.get(2).value());
    }

    @Test
    public void testFormData_selectWithExplicitSelectedOptions_addsSelectedOnly() {
        String html = "<form action='/submit'>" +
                "<select name='colors' multiple>" +
                "<option value='red'>Red</option>" +
                "<option value='blue' selected>Blue</option>" +
                "<option value='green' selected>Green</option>" +
                "</select>" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("colors", data.get(0).key());
        assertEquals("blue", data.get(0).value());
        assertEquals("colors", data.get(1).key());
        assertEquals("green", data.get(1).value());
    }

    @Test
    public void testFormData_selectWithoutSelectedOption_defaultsToFirstOption() {
        String html = "<form action='/submit'>" +
                "<select name='city'>" +
                "<option value='bkk'>Bangkok</option>" +
                "<option value='cnx'>Chiang Mai</option>" +
                "</select>" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(1, data.size());
        assertEquals("city", data.get(0).key());
        assertEquals("bkk", data.get(0).value());
    }

    @Test
    public void testFormData_selectWithoutAnyOptions_nothingAdded() {
        String html = "<form action='/submit'>" +
                "<select name='emptySelect'></select>" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_checkboxAndRadio_checkedAddedAndUncheckedIgnored() {
        String html = "<form action='/submit'>" +
                "<input type='checkbox' name='c1' value='v1' checked />" +
                "<input type='checkbox' name='c2' value='v2' />" +
                "<input type='radio' name='r1' value='v3' checked />" +
                "<input type='radio' name='r2' value='v4' />" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("c1", data.get(0).key());
        assertEquals("v1", data.get(0).value());
        assertEquals("r1", data.get(1).key());
        assertEquals("v3", data.get(1).value());
    }

    @Test
    public void testFormData_caseInsensitiveCheckboxAndRadioType_handledCorrectly() {
        String html = "<form action='/submit'>" +
                "<input type='CHECKBOX' name='c1' value='v1' checked />" +
                "<input type='Radio' name='r1' value='v2' checked />" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("c1", data.get(0).key());
        assertEquals("v1", data.get(0).value());
        assertEquals("r1", data.get(1).key());
        assertEquals("v2", data.get(1).value());
    }

    @Test
    public void testFormData_returnedListIsCopy_modifyingDoesNotAffectElements() {
        String html = "<form action='/submit'><input type='text' name='foo' value='bar' /></form>";
        Document doc = Jsoup.parse(html, "http://example.com");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        data.clear();

        assertEquals(1, form.formData().size());
    }

    @Test
    public void testEquals_sameAndDifferentInstances_returnsExpected() {
        FormElement form1 = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        FormElement form2 = form1;
        FormElement form3 = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());

        assertTrue(form1.equals(form2));
        assertTrue(form1.equals(form1));
        assertFalse(form1.equals(null));
        assertFalse(form1.equals("non-element string"));
        assertFalse(form1.equals(form3));
    }
}
