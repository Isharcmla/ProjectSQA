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

public class Element_getElementsContainingOwnText_1199744512150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4863;
     Object term30051;
     Object term30047;

    public Element_getElementsContainingOwnText_1199744512150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4886 = new ArrayList();
        ((ArrayList) term4886).add((Object)null);
        ((ArrayList) term4886).add((Object)null);
        ((ArrayList) term4886).add((Object)null);
        ((ArrayList) term4886).add((Object)null);
        ((ArrayList) term4886).add((Object)null);
        ((ArrayList) term4886).add((Object)null);
        ((ArrayList) term4886).add((Object)null);
        LinkedHashMap term4891 = new LinkedHashMap();
        term4863 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4864 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4890 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4864, term4864.getClass(), "tagName", "riMtzCoxNj");
        setBooleanField(term4864, term4864.getClass(), "isBlock", false);
        setBooleanField(term4864, term4864.getClass(), "formatAsBlock", false);
        setBooleanField(term4864, term4864.getClass(), "canContainBlock", true);
        setBooleanField(term4864, term4864.getClass(), "canContainInline", false);
        setBooleanField(term4864, term4864.getClass(), "empty", false);
        setBooleanField(term4864, term4864.getClass(), "selfClosing", false);
        setBooleanField(term4864, term4864.getClass(), "preserveWhitespace", false);
        setBooleanField(term4864, term4864.getClass(), "formList", true);
        setBooleanField(term4864, term4864.getClass(), "formSubmit", false);
        setField(term4863, term4863.getClass(), "tag", term4864);
        setField(term4863, term4863.getClass(), "parentNode", null);
        setField(term4863, term4863.getClass(), "childNodes", term4886);
        setField(term4890, term4890.getClass(), "attributes", term4891);
        setField(term4863, term4863.getClass(), "attributes", term4890);
        setField(term4863, term4863.getClass(), "baseUri", "RDnkgWkcbz");
        setIntField(term4863, term4863.getClass(), "siblingIndex", -1888585309);
        ArrayList term30055 = new ArrayList();
        ((ArrayList) term30055).add((Object)null);
        ((ArrayList) term30055).add((Object)null);
        ((ArrayList) term30055).add((Object)null);
        ((ArrayList) term30055).add((Object)null);
        ((ArrayList) term30055).add((Object)null);
        ((ArrayList) term30055).add((Object)null);
        ((ArrayList) term30055).add((Object)null);
        LinkedHashMap term30058 = new LinkedHashMap();
        term30051 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30052 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30057 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30052, term30052.getClass(), "tagName", "riMtzCoxNj");
        setBooleanField(term30052, term30052.getClass(), "isBlock", false);
        setBooleanField(term30052, term30052.getClass(), "formatAsBlock", false);
        setBooleanField(term30052, term30052.getClass(), "canContainBlock", true);
        setBooleanField(term30052, term30052.getClass(), "canContainInline", false);
        setBooleanField(term30052, term30052.getClass(), "empty", false);
        setBooleanField(term30052, term30052.getClass(), "selfClosing", false);
        setBooleanField(term30052, term30052.getClass(), "preserveWhitespace", false);
        setBooleanField(term30052, term30052.getClass(), "formList", true);
        setBooleanField(term30052, term30052.getClass(), "formSubmit", false);
        setField(term30051, term30051.getClass(), "tag", term30052);
        setField(term30051, term30051.getClass(), "parentNode", null);
        setField(term30051, term30051.getClass(), "childNodes", term30055);
        setField(term30057, term30057.getClass(), "attributes", term30058);
        setField(term30051, term30051.getClass(), "attributes", term30057);
        setField(term30051, term30051.getClass(), "baseUri", "RDnkgWkcbz");
        setIntField(term30051, term30051.getClass(), "siblingIndex", -1888585309);
        term30047 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term30048 = (Object[]) newArray("java.lang.Object", 0);
        setField(term30047, term30047.getClass(), "elementData", term30048);
        setIntField(term30047, term30047.getClass(), "size", 0);
        setIntField(term30047, term30047.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IBpaxltauX";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term4863, args);
        assertTrue(recursiveEquals(term4863, term30051));
        assertTrue(recursiveEquals(retValue, term30047));
    }

};


