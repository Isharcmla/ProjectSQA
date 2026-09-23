package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_getElementsByIndexGreaterThan_364627238154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4789;
     Object term4840;
     Object term30055;
     Object term30051;

    public Element_getElementsByIndexGreaterThan_364627238154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4811 = new ArrayList();
        LinkedHashMap term4816 = new LinkedHashMap();
        term4789 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4790 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4815 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4790, term4790.getClass(), "tagName", "UDaboHZHhz");
        setBooleanField(term4790, term4790.getClass(), "isBlock", false);
        setBooleanField(term4790, term4790.getClass(), "formatAsBlock", false);
        setBooleanField(term4790, term4790.getClass(), "canContainInline", true);
        setBooleanField(term4790, term4790.getClass(), "empty", false);
        setBooleanField(term4790, term4790.getClass(), "selfClosing", true);
        setBooleanField(term4790, term4790.getClass(), "preserveWhitespace", false);
        setBooleanField(term4790, term4790.getClass(), "formList", false);
        setBooleanField(term4790, term4790.getClass(), "formSubmit", true);
        setField(term4789, term4789.getClass(), "tag", term4790);
        setField(term4789, term4789.getClass(), "parentNode", null);
        setField(term4789, term4789.getClass(), "childNodes", term4811);
        setField(term4815, term4815.getClass(), "attributes", term4816);
        setField(term4789, term4789.getClass(), "attributes", term4815);
        setField(term4789, term4789.getClass(), "baseUri", "YAXkVjQZcV");
        setIntField(term4789, term4789.getClass(), "siblingIndex", -1772434990);
        term4840 = new Integer(-1845499264);
        ArrayList term30058 = new ArrayList();
        LinkedHashMap term30061 = new LinkedHashMap();
        term30055 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30056 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30060 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30056, term30056.getClass(), "tagName", "");
        setBooleanField(term30056, term30056.getClass(), "isBlock", false);
        setBooleanField(term30056, term30056.getClass(), "formatAsBlock", false);
        setBooleanField(term30056, term30056.getClass(), "canContainInline", true);
        setBooleanField(term30056, term30056.getClass(), "empty", false);
        setBooleanField(term30056, term30056.getClass(), "selfClosing", true);
        setBooleanField(term30056, term30056.getClass(), "preserveWhitespace", false);
        setBooleanField(term30056, term30056.getClass(), "formList", false);
        setBooleanField(term30056, term30056.getClass(), "formSubmit", true);
        setField(term30055, term30055.getClass(), "tag", term30056);
        setField(term30055, term30055.getClass(), "parentNode", null);
        setField(term30055, term30055.getClass(), "childNodes", term30058);
        setField(term30060, term30060.getClass(), "attributes", term30061);
        setField(term30055, term30055.getClass(), "attributes", term30060);
        setField(term30055, term30055.getClass(), "baseUri", "YAXkVjQZcV");
        setIntField(term30055, term30055.getClass(), "siblingIndex", -1772434990);
        ArrayList term29768 = new ArrayList();
        LinkedHashMap term29773 = new LinkedHashMap();
        term30051 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term30052 = (Object[]) newArray("java.lang.Object", 10);
        Object term29757 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29758 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29772 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29758, term29758.getClass(), "tagName", "");
        setBooleanField(term29758, term29758.getClass(), "isBlock", false);
        setBooleanField(term29758, term29758.getClass(), "formatAsBlock", false);
        setBooleanField(term29758, term29758.getClass(), "canContainInline", true);
        setBooleanField(term29758, term29758.getClass(), "empty", false);
        setBooleanField(term29758, term29758.getClass(), "selfClosing", true);
        setBooleanField(term29758, term29758.getClass(), "preserveWhitespace", false);
        setBooleanField(term29758, term29758.getClass(), "formList", false);
        setBooleanField(term29758, term29758.getClass(), "formSubmit", true);
        setField(term29757, term29757.getClass(), "tag", term29758);
        setField(term29757, term29757.getClass(), "parentNode", null);
        setField(term29757, term29757.getClass(), "childNodes", term29768);
        setField(term29772, term29772.getClass(), "attributes", term29773);
        setField(term29757, term29757.getClass(), "attributes", term29772);
        setField(term29757, term29757.getClass(), "baseUri", "YAXkVjQZcV");
        setIntField(term29757, term29757.getClass(), "siblingIndex", -1772434990);
        setElement(term30052, 0, term29757);
        setField(term30051, term30051.getClass(), "elementData", term30052);
        setIntField(term30051, term30051.getClass(), "size", 1);
        setIntField(term30051, term30051.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4840;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term4789, args);
        assertTrue(recursiveEquals(term4789, term30055));
        assertTrue(recursiveEquals(term4840, -1845499264));
        assertTrue(recursiveEquals(retValue, term30051));
    }

};


