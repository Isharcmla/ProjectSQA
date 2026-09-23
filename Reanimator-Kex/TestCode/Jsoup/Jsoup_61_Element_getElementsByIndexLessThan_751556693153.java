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

public class Element_getElementsByIndexLessThan_751556693153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716;
     Object term4767;
     Object term29623;
     Object term29619;

    public Element_getElementsByIndexLessThan_751556693153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4738 = new ArrayList();
        ((ArrayList) term4738).add((Object)null);
        ((ArrayList) term4738).add((Object)null);
        ((ArrayList) term4738).add((Object)null);
        ((ArrayList) term4738).add((Object)null);
        LinkedHashMap term4743 = new LinkedHashMap();
        term4716 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4717 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4742 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4717, term4717.getClass(), "tagName", "aQFUvuaYxd");
        setBooleanField(term4717, term4717.getClass(), "isBlock", true);
        setBooleanField(term4717, term4717.getClass(), "formatAsBlock", false);
        setBooleanField(term4717, term4717.getClass(), "canContainInline", false);
        setBooleanField(term4717, term4717.getClass(), "empty", true);
        setBooleanField(term4717, term4717.getClass(), "selfClosing", true);
        setBooleanField(term4717, term4717.getClass(), "preserveWhitespace", false);
        setBooleanField(term4717, term4717.getClass(), "formList", false);
        setBooleanField(term4717, term4717.getClass(), "formSubmit", false);
        setField(term4716, term4716.getClass(), "tag", term4717);
        setField(term4716, term4716.getClass(), "parentNode", null);
        setField(term4716, term4716.getClass(), "childNodes", term4738);
        setField(term4742, term4742.getClass(), "attributes", term4743);
        setField(term4716, term4716.getClass(), "attributes", term4742);
        setField(term4716, term4716.getClass(), "baseUri", "rIPMBcrNqB");
        setIntField(term4716, term4716.getClass(), "siblingIndex", 1114000454);
        term4767 = new Integer(-556405712);
        ArrayList term29627 = new ArrayList();
        ((ArrayList) term29627).add((Object)null);
        ((ArrayList) term29627).add((Object)null);
        ((ArrayList) term29627).add((Object)null);
        ((ArrayList) term29627).add((Object)null);
        LinkedHashMap term29630 = new LinkedHashMap();
        term29623 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29624 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29629 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29624, term29624.getClass(), "tagName", "aQFUvuaYxd");
        setBooleanField(term29624, term29624.getClass(), "isBlock", true);
        setBooleanField(term29624, term29624.getClass(), "formatAsBlock", false);
        setBooleanField(term29624, term29624.getClass(), "canContainInline", false);
        setBooleanField(term29624, term29624.getClass(), "empty", true);
        setBooleanField(term29624, term29624.getClass(), "selfClosing", true);
        setBooleanField(term29624, term29624.getClass(), "preserveWhitespace", false);
        setBooleanField(term29624, term29624.getClass(), "formList", false);
        setBooleanField(term29624, term29624.getClass(), "formSubmit", false);
        setField(term29623, term29623.getClass(), "tag", term29624);
        setField(term29623, term29623.getClass(), "parentNode", null);
        setField(term29623, term29623.getClass(), "childNodes", term29627);
        setField(term29629, term29629.getClass(), "attributes", term29630);
        setField(term29623, term29623.getClass(), "attributes", term29629);
        setField(term29623, term29623.getClass(), "baseUri", "rIPMBcrNqB");
        setIntField(term29623, term29623.getClass(), "siblingIndex", 1114000454);
        term29619 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term29620 = (Object[]) newArray("java.lang.Object", 0);
        setField(term29619, term29619.getClass(), "elementData", term29620);
        setIntField(term29619, term29619.getClass(), "size", 0);
        setIntField(term29619, term29619.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4767;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term4716, args);
        assertTrue(recursiveEquals(term4716, term29623));
        assertTrue(recursiveEquals(term4767, -556405712));
        assertTrue(recursiveEquals(retValue, term29619));
    }

};


