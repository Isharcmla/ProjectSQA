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

public class Element_getElementsByIndexLessThan_751556693146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4547;
     Object term4599;
     Object term27949;
     Object term27945;

    public Element_getElementsByIndexLessThan_751556693146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4570 = new ArrayList();
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        LinkedHashMap term4575 = new LinkedHashMap();
        term4547 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4548 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4574 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4548, term4548.getClass(), "tagName", "qnvxzwuGKX");
        setBooleanField(term4548, term4548.getClass(), "isBlock", true);
        setBooleanField(term4548, term4548.getClass(), "formatAsBlock", false);
        setBooleanField(term4548, term4548.getClass(), "canContainBlock", true);
        setBooleanField(term4548, term4548.getClass(), "canContainInline", true);
        setBooleanField(term4548, term4548.getClass(), "empty", false);
        setBooleanField(term4548, term4548.getClass(), "selfClosing", true);
        setBooleanField(term4548, term4548.getClass(), "preserveWhitespace", false);
        setBooleanField(term4548, term4548.getClass(), "formList", false);
        setBooleanField(term4548, term4548.getClass(), "formSubmit", true);
        setField(term4547, term4547.getClass(), "tag", term4548);
        setField(term4547, term4547.getClass(), "parentNode", null);
        setField(term4547, term4547.getClass(), "childNodes", term4570);
        setField(term4574, term4574.getClass(), "attributes", term4575);
        setField(term4547, term4547.getClass(), "attributes", term4574);
        setField(term4547, term4547.getClass(), "baseUri", "ZfBIVGBQOE");
        setIntField(term4547, term4547.getClass(), "siblingIndex", 941650513);
        term4599 = new Integer(444029505);
        ArrayList term27952 = new ArrayList();
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        ((ArrayList) term27952).add((Object)null);
        LinkedHashMap term27955 = new LinkedHashMap();
        term27949 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term27950 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term27954 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term27950, term27950.getClass(), "tagName", "");
        setBooleanField(term27950, term27950.getClass(), "isBlock", true);
        setBooleanField(term27950, term27950.getClass(), "formatAsBlock", false);
        setBooleanField(term27950, term27950.getClass(), "canContainBlock", true);
        setBooleanField(term27950, term27950.getClass(), "canContainInline", true);
        setBooleanField(term27950, term27950.getClass(), "empty", false);
        setBooleanField(term27950, term27950.getClass(), "selfClosing", true);
        setBooleanField(term27950, term27950.getClass(), "preserveWhitespace", false);
        setBooleanField(term27950, term27950.getClass(), "formList", false);
        setBooleanField(term27950, term27950.getClass(), "formSubmit", true);
        setField(term27949, term27949.getClass(), "tag", term27950);
        setField(term27949, term27949.getClass(), "parentNode", null);
        setField(term27949, term27949.getClass(), "childNodes", term27952);
        setField(term27954, term27954.getClass(), "attributes", term27955);
        setField(term27949, term27949.getClass(), "attributes", term27954);
        setField(term27949, term27949.getClass(), "baseUri", "ZfBIVGBQOE");
        setIntField(term27949, term27949.getClass(), "siblingIndex", 941650513);
        ArrayList term27714 = new ArrayList();
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        ((ArrayList) term27714).add((Object)null);
        LinkedHashMap term27719 = new LinkedHashMap();
        term27945 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term27946 = (Object[]) newArray("java.lang.Object", 10);
        Object term27702 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term27703 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term27718 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term27703, term27703.getClass(), "tagName", "");
        setBooleanField(term27703, term27703.getClass(), "isBlock", true);
        setBooleanField(term27703, term27703.getClass(), "formatAsBlock", false);
        setBooleanField(term27703, term27703.getClass(), "canContainBlock", true);
        setBooleanField(term27703, term27703.getClass(), "canContainInline", true);
        setBooleanField(term27703, term27703.getClass(), "empty", false);
        setBooleanField(term27703, term27703.getClass(), "selfClosing", true);
        setBooleanField(term27703, term27703.getClass(), "preserveWhitespace", false);
        setBooleanField(term27703, term27703.getClass(), "formList", false);
        setBooleanField(term27703, term27703.getClass(), "formSubmit", true);
        setField(term27702, term27702.getClass(), "tag", term27703);
        setField(term27702, term27702.getClass(), "parentNode", null);
        setField(term27702, term27702.getClass(), "childNodes", term27714);
        setField(term27718, term27718.getClass(), "attributes", term27719);
        setField(term27702, term27702.getClass(), "attributes", term27718);
        setField(term27702, term27702.getClass(), "baseUri", "ZfBIVGBQOE");
        setIntField(term27702, term27702.getClass(), "siblingIndex", 941650513);
        setElement(term27946, 0, term27702);
        setField(term27945, term27945.getClass(), "elementData", term27946);
        setIntField(term27945, term27945.getClass(), "size", 1);
        setIntField(term27945, term27945.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4599;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term4547, args);
        assertTrue(recursiveEquals(term4547, term27949));
        assertTrue(recursiveEquals(term4599, 444029505));
        assertTrue(recursiveEquals(retValue, term27945));
    }

};


