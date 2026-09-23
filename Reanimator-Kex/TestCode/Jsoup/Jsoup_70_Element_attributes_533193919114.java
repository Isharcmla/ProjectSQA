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

public class Element_attributes_533193919114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term56426;
     Object term56408;

    public Element_attributes_533193919114() {
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
        ArrayList term56433 = new ArrayList();
        ((ArrayList) term56433).add((Object)null);
        ((ArrayList) term56433).add((Object)null);
        ((ArrayList) term56433).add((Object)null);
        term56426 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56427 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56430 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56431 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56432 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56435 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56436 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56437 = (Object[]) newArray("java.lang.String", 0);
        setField(term56427, term56427.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term56427, term56427.getClass(), "isBlock", true);
        setBooleanField(term56427, term56427.getClass(), "formatAsBlock", false);
        setBooleanField(term56427, term56427.getClass(), "canContainInline", true);
        setBooleanField(term56427, term56427.getClass(), "empty", true);
        setBooleanField(term56427, term56427.getClass(), "selfClosing", true);
        setBooleanField(term56427, term56427.getClass(), "preserveWhitespace", true);
        setBooleanField(term56427, term56427.getClass(), "formList", false);
        setBooleanField(term56427, term56427.getClass(), "formSubmit", false);
        setField(term56426, term56426.getClass(), "tag", term56427);
        setField(term56430, term56430.getClass(), "referent", null);
        setField(term56431, term56431.getClass(), "lock", term56432);
        setField(term56431, term56431.getClass(), "head", null);
        setLongField(term56431, term56431.getClass(), "queueLength", -8257434502486459194L);
        setField(term56430, term56430.getClass(), "queue", term56431);
        setField(term56430, term56430.getClass(), "next", null);
        setField(term56430, term56430.getClass(), "discovered", null);
        setField(term56426, term56426.getClass(), "shadowChildrenRef", term56430);
        setField(term56426, term56426.getClass(), "childNodes", term56433);
        setIntField(term56435, term56435.getClass(), "size", -616727354);
        setField(term56435, term56435.getClass(), "keys", term56436);
        setField(term56435, term56435.getClass(), "vals", term56437);
        setField(term56426, term56426.getClass(), "attributes", term56435);
        setField(term56426, term56426.getClass(), "baseUri", "NRdvgJlhkX");
        setField(term56426, term56426.getClass(), "parentNode", null);
        setIntField(term56426, term56426.getClass(), "siblingIndex", -1955890973);
        term56408 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56410 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56411 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term56408, term56408.getClass(), "size", -616727354);
        setField(term56408, term56408.getClass(), "keys", term56410);
        setField(term56408, term56408.getClass(), "vals", term56411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "attributes", argTypes, term267, args);
        assertTrue(recursiveEquals(term267, term56426));
        assertTrue(recursiveEquals(retValue, term56408));
    }

};


