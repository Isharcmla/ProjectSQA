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

public class Element_attributes_533193919116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term56615;
     Object term56597;

    public Element_attributes_533193919116() {
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
        ArrayList term56622 = new ArrayList();
        ((ArrayList) term56622).add((Object)null);
        ((ArrayList) term56622).add((Object)null);
        ((ArrayList) term56622).add((Object)null);
        term56615 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56616 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56619 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56620 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56621 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56624 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56625 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56626 = (Object[]) newArray("java.lang.String", 0);
        setField(term56616, term56616.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term56616, term56616.getClass(), "isBlock", true);
        setBooleanField(term56616, term56616.getClass(), "formatAsBlock", false);
        setBooleanField(term56616, term56616.getClass(), "canContainInline", true);
        setBooleanField(term56616, term56616.getClass(), "empty", true);
        setBooleanField(term56616, term56616.getClass(), "selfClosing", true);
        setBooleanField(term56616, term56616.getClass(), "preserveWhitespace", true);
        setBooleanField(term56616, term56616.getClass(), "formList", false);
        setBooleanField(term56616, term56616.getClass(), "formSubmit", false);
        setField(term56615, term56615.getClass(), "tag", term56616);
        setField(term56619, term56619.getClass(), "referent", null);
        setField(term56620, term56620.getClass(), "lock", term56621);
        setField(term56620, term56620.getClass(), "head", null);
        setLongField(term56620, term56620.getClass(), "queueLength", -8257434502486459194L);
        setField(term56619, term56619.getClass(), "queue", term56620);
        setField(term56619, term56619.getClass(), "next", null);
        setField(term56619, term56619.getClass(), "discovered", null);
        setField(term56615, term56615.getClass(), "shadowChildrenRef", term56619);
        setField(term56615, term56615.getClass(), "childNodes", term56622);
        setIntField(term56624, term56624.getClass(), "size", -616727354);
        setField(term56624, term56624.getClass(), "keys", term56625);
        setField(term56624, term56624.getClass(), "vals", term56626);
        setField(term56615, term56615.getClass(), "attributes", term56624);
        setField(term56615, term56615.getClass(), "baseUri", "NRdvgJlhkX");
        setField(term56615, term56615.getClass(), "parentNode", null);
        setIntField(term56615, term56615.getClass(), "siblingIndex", -1955890973);
        term56597 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56599 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56600 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term56597, term56597.getClass(), "size", -616727354);
        setField(term56597, term56597.getClass(), "keys", term56599);
        setField(term56597, term56597.getClass(), "vals", term56600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "attributes", argTypes, term267, args);
        assertTrue(recursiveEquals(term267, term56615));
        assertTrue(recursiveEquals(retValue, term56597));
    }

};


