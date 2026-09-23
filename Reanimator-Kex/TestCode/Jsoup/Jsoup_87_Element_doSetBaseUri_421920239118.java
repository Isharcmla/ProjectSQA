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

public class Element_doSetBaseUri_421920239118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;
     Object term56851;

    public Element_doSetBaseUri_421920239118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term427 = new ArrayList();
        ((ArrayList) term427).add((Object)null);
        term401 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term423 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term424 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term425 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term431 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term433 = (Object[]) newArray("java.lang.String", 0);
        Object[] term434 = (Object[]) newArray("java.lang.String", 0);
        setField(term402, term402.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term402, term402.getClass(), "isBlock", true);
        setBooleanField(term402, term402.getClass(), "formatAsBlock", false);
        setBooleanField(term402, term402.getClass(), "canContainInline", false);
        setBooleanField(term402, term402.getClass(), "empty", true);
        setBooleanField(term402, term402.getClass(), "selfClosing", false);
        setBooleanField(term402, term402.getClass(), "preserveWhitespace", true);
        setBooleanField(term402, term402.getClass(), "formList", false);
        setBooleanField(term402, term402.getClass(), "formSubmit", false);
        setField(term401, term401.getClass(), "tag", term402);
        setField(term423, term423.getClass(), "referent", null);
        setField(term424, term424.getClass(), "lock", term425);
        setField(term424, term424.getClass(), "head", null);
        setLongField(term424, term424.getClass(), "queueLength", 5270370404989704783L);
        setField(term423, term423.getClass(), "queue", term424);
        setField(term423, term423.getClass(), "next", null);
        setField(term423, term423.getClass(), "discovered", null);
        setField(term401, term401.getClass(), "shadowChildrenRef", term423);
        setField(term401, term401.getClass(), "childNodes", term427);
        setIntField(term431, term431.getClass(), "size", -1339778481);
        setField(term431, term431.getClass(), "keys", term433);
        setField(term431, term431.getClass(), "vals", term434);
        setField(term401, term401.getClass(), "attributes", term431);
        setField(term401, term401.getClass(), "baseUri", "oVcInYnLWB");
        setField(term401, term401.getClass(), "parentNode", null);
        setIntField(term401, term401.getClass(), "siblingIndex", 1725571209);
        ArrayList term56858 = new ArrayList();
        ((ArrayList) term56858).add((Object)null);
        term56851 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56852 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56855 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56856 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56857 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56860 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56861 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56862 = (Object[]) newArray("java.lang.String", 0);
        setField(term56852, term56852.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term56852, term56852.getClass(), "isBlock", true);
        setBooleanField(term56852, term56852.getClass(), "formatAsBlock", false);
        setBooleanField(term56852, term56852.getClass(), "canContainInline", false);
        setBooleanField(term56852, term56852.getClass(), "empty", true);
        setBooleanField(term56852, term56852.getClass(), "selfClosing", false);
        setBooleanField(term56852, term56852.getClass(), "preserveWhitespace", true);
        setBooleanField(term56852, term56852.getClass(), "formList", false);
        setBooleanField(term56852, term56852.getClass(), "formSubmit", false);
        setField(term56851, term56851.getClass(), "tag", term56852);
        setField(term56855, term56855.getClass(), "referent", null);
        setField(term56856, term56856.getClass(), "lock", term56857);
        setField(term56856, term56856.getClass(), "head", null);
        setLongField(term56856, term56856.getClass(), "queueLength", 5270370404989704783L);
        setField(term56855, term56855.getClass(), "queue", term56856);
        setField(term56855, term56855.getClass(), "next", null);
        setField(term56855, term56855.getClass(), "discovered", null);
        setField(term56851, term56851.getClass(), "shadowChildrenRef", term56855);
        setField(term56851, term56851.getClass(), "childNodes", term56858);
        setIntField(term56860, term56860.getClass(), "size", -1339778481);
        setField(term56860, term56860.getClass(), "keys", term56861);
        setField(term56860, term56860.getClass(), "vals", term56862);
        setField(term56851, term56851.getClass(), "attributes", term56860);
        setField(term56851, term56851.getClass(), "baseUri", "aJlieCFVtF");
        setField(term56851, term56851.getClass(), "parentNode", null);
        setIntField(term56851, term56851.getClass(), "siblingIndex", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "doSetBaseUri", argTypes, term401, args);
        assertTrue(recursiveEquals(term401, term56851));
    }

};


