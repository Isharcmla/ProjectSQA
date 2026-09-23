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
     Object term30226;
     Object term30222;

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
        ArrayList term30230 = new ArrayList();
        ((ArrayList) term30230).add((Object)null);
        ((ArrayList) term30230).add((Object)null);
        ((ArrayList) term30230).add((Object)null);
        ((ArrayList) term30230).add((Object)null);
        ((ArrayList) term30230).add((Object)null);
        ((ArrayList) term30230).add((Object)null);
        ((ArrayList) term30230).add((Object)null);
        LinkedHashMap term30233 = new LinkedHashMap();
        term30226 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30227 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30232 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30227, term30227.getClass(), "tagName", "riMtzCoxNj");
        setBooleanField(term30227, term30227.getClass(), "isBlock", false);
        setBooleanField(term30227, term30227.getClass(), "formatAsBlock", false);
        setBooleanField(term30227, term30227.getClass(), "canContainBlock", true);
        setBooleanField(term30227, term30227.getClass(), "canContainInline", false);
        setBooleanField(term30227, term30227.getClass(), "empty", false);
        setBooleanField(term30227, term30227.getClass(), "selfClosing", false);
        setBooleanField(term30227, term30227.getClass(), "preserveWhitespace", false);
        setBooleanField(term30227, term30227.getClass(), "formList", true);
        setBooleanField(term30227, term30227.getClass(), "formSubmit", false);
        setField(term30226, term30226.getClass(), "tag", term30227);
        setField(term30226, term30226.getClass(), "parentNode", null);
        setField(term30226, term30226.getClass(), "childNodes", term30230);
        setField(term30232, term30232.getClass(), "attributes", term30233);
        setField(term30226, term30226.getClass(), "attributes", term30232);
        setField(term30226, term30226.getClass(), "baseUri", "RDnkgWkcbz");
        setIntField(term30226, term30226.getClass(), "siblingIndex", -1888585309);
        term30222 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term30223 = (Object[]) newArray("java.lang.Object", 0);
        setField(term30222, term30222.getClass(), "elementData", term30223);
        setIntField(term30222, term30222.getClass(), "size", 0);
        setIntField(term30222, term30222.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IBpaxltauX";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term4863, args);
        assertTrue(recursiveEquals(term4863, term30226));
        assertTrue(recursiveEquals(retValue, term30222));
    }

};


