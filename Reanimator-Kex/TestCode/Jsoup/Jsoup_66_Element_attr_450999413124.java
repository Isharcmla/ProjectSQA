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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class Element_attr_450999413124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1092;
     Object term1151;

    public Element_attr_450999413124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1118 = new ArrayList();
        ((ArrayList) term1118).add((Object)null);
        ((ArrayList) term1118).add((Object)null);
        term1092 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1093 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1114 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1115 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1116 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1122 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1124 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1125 = (Object[]) newArray("java.lang.String", 0);
        setField(term1093, term1093.getClass(), "tagName", "Ghbwtircqb");
        setBooleanField(term1093, term1093.getClass(), "isBlock", false);
        setBooleanField(term1093, term1093.getClass(), "formatAsBlock", false);
        setBooleanField(term1093, term1093.getClass(), "canContainInline", true);
        setBooleanField(term1093, term1093.getClass(), "empty", false);
        setBooleanField(term1093, term1093.getClass(), "selfClosing", false);
        setBooleanField(term1093, term1093.getClass(), "preserveWhitespace", true);
        setBooleanField(term1093, term1093.getClass(), "formList", true);
        setBooleanField(term1093, term1093.getClass(), "formSubmit", false);
        setField(term1092, term1092.getClass(), "tag", term1093);
        setField(term1114, term1114.getClass(), "referent", null);
        setField(term1115, term1115.getClass(), "lock", term1116);
        setField(term1115, term1115.getClass(), "head", null);
        setLongField(term1115, term1115.getClass(), "queueLength", 2535595959091595249L);
        setField(term1114, term1114.getClass(), "queue", term1115);
        setField(term1114, term1114.getClass(), "next", null);
        setField(term1114, term1114.getClass(), "discovered", null);
        setField(term1092, term1092.getClass(), "shadowChildrenRef", term1114);
        setField(term1092, term1092.getClass(), "childNodes", term1118);
        setIntField(term1122, term1122.getClass(), "size", 865208305);
        setField(term1122, term1122.getClass(), "keys", term1124);
        setField(term1122, term1122.getClass(), "vals", term1125);
        setField(term1092, term1092.getClass(), "attributes", term1122);
        setField(term1092, term1092.getClass(), "baseUri", "xrwlQZdwCp");
        setField(term1092, term1092.getClass(), "parentNode", null);
        setIntField(term1092, term1092.getClass(), "siblingIndex", -1275173084);
        term1151 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "IDCWpPLRkE";
        args[1] = term1151;
        try {
            callMethod(klass, "attr", argTypes, term1092, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


