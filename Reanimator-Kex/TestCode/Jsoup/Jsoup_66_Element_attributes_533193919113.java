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

public class Element_attributes_533193919113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term10002;
     Object term9984;

    public Element_attributes_533193919113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term293 = new ArrayList();
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        term267 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term268 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term289 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term290 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term291 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term297 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term299 = (Object[]) newArray("java.lang.String", 0);
        Object[] term300 = (Object[]) newArray("java.lang.String", 0);
        setField(term268, term268.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term268, term268.getClass(), "isBlock", true);
        setBooleanField(term268, term268.getClass(), "formatAsBlock", false);
        setBooleanField(term268, term268.getClass(), "canContainInline", true);
        setBooleanField(term268, term268.getClass(), "empty", true);
        setBooleanField(term268, term268.getClass(), "selfClosing", true);
        setBooleanField(term268, term268.getClass(), "preserveWhitespace", true);
        setBooleanField(term268, term268.getClass(), "formList", false);
        setBooleanField(term268, term268.getClass(), "formSubmit", false);
        setField(term267, term267.getClass(), "tag", term268);
        setField(term289, term289.getClass(), "referent", null);
        setField(term290, term290.getClass(), "lock", term291);
        setField(term290, term290.getClass(), "head", null);
        setLongField(term290, term290.getClass(), "queueLength", -8257434502486459194L);
        setField(term289, term289.getClass(), "queue", term290);
        setField(term289, term289.getClass(), "next", null);
        setField(term289, term289.getClass(), "discovered", null);
        setField(term267, term267.getClass(), "shadowChildrenRef", term289);
        setField(term267, term267.getClass(), "childNodes", term293);
        setIntField(term297, term297.getClass(), "size", -616727354);
        setField(term297, term297.getClass(), "keys", term299);
        setField(term297, term297.getClass(), "vals", term300);
        setField(term267, term267.getClass(), "attributes", term297);
        setField(term267, term267.getClass(), "baseUri", "NRdvgJlhkX");
        setField(term267, term267.getClass(), "parentNode", null);
        setIntField(term267, term267.getClass(), "siblingIndex", -1955890973);
        ArrayList term10009 = new ArrayList();
        ((ArrayList) term10009).add((Object)null);
        ((ArrayList) term10009).add((Object)null);
        ((ArrayList) term10009).add((Object)null);
        term10002 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10003 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10006 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10007 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10008 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10011 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10012 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10013 = (Object[]) newArray("java.lang.String", 0);
        setField(term10003, term10003.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term10003, term10003.getClass(), "isBlock", true);
        setBooleanField(term10003, term10003.getClass(), "formatAsBlock", false);
        setBooleanField(term10003, term10003.getClass(), "canContainInline", true);
        setBooleanField(term10003, term10003.getClass(), "empty", true);
        setBooleanField(term10003, term10003.getClass(), "selfClosing", true);
        setBooleanField(term10003, term10003.getClass(), "preserveWhitespace", true);
        setBooleanField(term10003, term10003.getClass(), "formList", false);
        setBooleanField(term10003, term10003.getClass(), "formSubmit", false);
        setField(term10002, term10002.getClass(), "tag", term10003);
        setField(term10006, term10006.getClass(), "referent", null);
        setField(term10007, term10007.getClass(), "lock", term10008);
        setField(term10007, term10007.getClass(), "head", null);
        setLongField(term10007, term10007.getClass(), "queueLength", -8257434502486459194L);
        setField(term10006, term10006.getClass(), "queue", term10007);
        setField(term10006, term10006.getClass(), "next", null);
        setField(term10006, term10006.getClass(), "discovered", null);
        setField(term10002, term10002.getClass(), "shadowChildrenRef", term10006);
        setField(term10002, term10002.getClass(), "childNodes", term10009);
        setIntField(term10011, term10011.getClass(), "size", -616727354);
        setField(term10011, term10011.getClass(), "keys", term10012);
        setField(term10011, term10011.getClass(), "vals", term10013);
        setField(term10002, term10002.getClass(), "attributes", term10011);
        setField(term10002, term10002.getClass(), "baseUri", "NRdvgJlhkX");
        setField(term10002, term10002.getClass(), "parentNode", null);
        setIntField(term10002, term10002.getClass(), "siblingIndex", -1955890973);
        term9984 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9986 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9987 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term9984, term9984.getClass(), "size", -616727354);
        setField(term9984, term9984.getClass(), "keys", term9986);
        setField(term9984, term9984.getClass(), "vals", term9987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "attributes", argTypes, term267, args);
        assertTrue(recursiveEquals(term267, term10002));
        assertTrue(recursiveEquals(retValue, term9984));
    }

};


