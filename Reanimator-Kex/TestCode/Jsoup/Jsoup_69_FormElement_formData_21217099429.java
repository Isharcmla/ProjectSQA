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

public class FormElement_formData_21217099429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338;
     Object term3201;
     Object term3146;

    public FormElement_formData_21217099429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term368 = new ArrayList();
        ((ArrayList) term368).add((Object)null);
        ((ArrayList) term368).add((Object)null);
        ((ArrayList) term368).add((Object)null);
        ((ArrayList) term368).add((Object)null);
        ((ArrayList) term368).add((Object)null);
        ((ArrayList) term368).add((Object)null);
        ((ArrayList) term368).add((Object)null);
        term338 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term339 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term340 = (Object[]) newArray("java.lang.Object", 0);
        Object term343 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term364 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term365 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term366 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term372 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term374 = (Object[]) newArray("java.lang.String", 0);
        Object[] term375 = (Object[]) newArray("java.lang.String", 0);
        setField(term339, term339.getClass(), "elementData", term340);
        setIntField(term339, term339.getClass(), "size", 0);
        setIntField(term339, term339.getClass(), "modCount", 0);
        setField(term338, term338.getClass(), "elements", term339);
        setField(term343, term343.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term343, term343.getClass(), "isBlock", false);
        setBooleanField(term343, term343.getClass(), "formatAsBlock", true);
        setBooleanField(term343, term343.getClass(), "canContainInline", true);
        setBooleanField(term343, term343.getClass(), "empty", false);
        setBooleanField(term343, term343.getClass(), "selfClosing", true);
        setBooleanField(term343, term343.getClass(), "preserveWhitespace", true);
        setBooleanField(term343, term343.getClass(), "formList", true);
        setBooleanField(term343, term343.getClass(), "formSubmit", false);
        setField(term338, term338.getClass(), "tag", term343);
        setField(term364, term364.getClass(), "referent", null);
        setField(term365, term365.getClass(), "lock", term366);
        setField(term365, term365.getClass(), "head", null);
        setLongField(term365, term365.getClass(), "queueLength", 5270370404989704783L);
        setField(term364, term364.getClass(), "queue", term365);
        setField(term364, term364.getClass(), "next", null);
        setField(term364, term364.getClass(), "discovered", null);
        setField(term338, term338.getClass(), "shadowChildrenRef", term364);
        setField(term338, term338.getClass(), "childNodes", term368);
        setIntField(term372, term372.getClass(), "size", -1339778481);
        setField(term372, term372.getClass(), "keys", term374);
        setField(term372, term372.getClass(), "vals", term375);
        setField(term338, term338.getClass(), "attributes", term372);
        setField(term338, term338.getClass(), "baseUri", "uuaPigETmJ");
        setField(term338, term338.getClass(), "parentNode", null);
        setIntField(term338, term338.getClass(), "siblingIndex", 1725571209);
        ArrayList term3210 = new ArrayList();
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        term3201 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term3202 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term3203 = (Object[]) newArray("java.lang.Object", 0);
        Object term3204 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3207 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3208 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3209 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3212 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3213 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3214 = (Object[]) newArray("java.lang.String", 0);
        setField(term3202, term3202.getClass(), "elementData", term3203);
        setIntField(term3202, term3202.getClass(), "size", 0);
        setIntField(term3202, term3202.getClass(), "modCount", 0);
        setField(term3201, term3201.getClass(), "elements", term3202);
        setField(term3204, term3204.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term3204, term3204.getClass(), "isBlock", false);
        setBooleanField(term3204, term3204.getClass(), "formatAsBlock", true);
        setBooleanField(term3204, term3204.getClass(), "canContainInline", true);
        setBooleanField(term3204, term3204.getClass(), "empty", false);
        setBooleanField(term3204, term3204.getClass(), "selfClosing", true);
        setBooleanField(term3204, term3204.getClass(), "preserveWhitespace", true);
        setBooleanField(term3204, term3204.getClass(), "formList", true);
        setBooleanField(term3204, term3204.getClass(), "formSubmit", false);
        setField(term3201, term3201.getClass(), "tag", term3204);
        setField(term3207, term3207.getClass(), "referent", null);
        setField(term3208, term3208.getClass(), "lock", term3209);
        setField(term3208, term3208.getClass(), "head", null);
        setLongField(term3208, term3208.getClass(), "queueLength", 5270370404989704783L);
        setField(term3207, term3207.getClass(), "queue", term3208);
        setField(term3207, term3207.getClass(), "next", null);
        setField(term3207, term3207.getClass(), "discovered", null);
        setField(term3201, term3201.getClass(), "shadowChildrenRef", term3207);
        setField(term3201, term3201.getClass(), "childNodes", term3210);
        setIntField(term3212, term3212.getClass(), "size", -1339778481);
        setField(term3212, term3212.getClass(), "keys", term3213);
        setField(term3212, term3212.getClass(), "vals", term3214);
        setField(term3201, term3201.getClass(), "attributes", term3212);
        setField(term3201, term3201.getClass(), "baseUri", "uuaPigETmJ");
        setField(term3201, term3201.getClass(), "parentNode", null);
        setIntField(term3201, term3201.getClass(), "siblingIndex", 1725571209);
        term3146 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term338, args);
        assertTrue(recursiveEquals(term338, term3201));
        assertTrue(recursiveEquals(retValue, term3146));
    }

};


