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

public class Element_is_2062761729140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1968;
     Object term63488;

    public Element_is_2062761729140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1994 = new ArrayList();
        ((ArrayList) term1994).add((Object)null);
        ((ArrayList) term1994).add((Object)null);
        ((ArrayList) term1994).add((Object)null);
        ((ArrayList) term1994).add((Object)null);
        ((ArrayList) term1994).add((Object)null);
        term1968 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1969 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1990 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1991 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1992 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1998 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2000 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2001 = (Object[]) newArray("java.lang.String", 0);
        setField(term1969, term1969.getClass(), "tagName", "fhkbdRViHi");
        setBooleanField(term1969, term1969.getClass(), "isBlock", true);
        setBooleanField(term1969, term1969.getClass(), "formatAsBlock", false);
        setBooleanField(term1969, term1969.getClass(), "canContainInline", true);
        setBooleanField(term1969, term1969.getClass(), "empty", true);
        setBooleanField(term1969, term1969.getClass(), "selfClosing", true);
        setBooleanField(term1969, term1969.getClass(), "preserveWhitespace", true);
        setBooleanField(term1969, term1969.getClass(), "formList", true);
        setBooleanField(term1969, term1969.getClass(), "formSubmit", false);
        setField(term1968, term1968.getClass(), "tag", term1969);
        setField(term1990, term1990.getClass(), "referent", null);
        setField(term1991, term1991.getClass(), "lock", term1992);
        setField(term1991, term1991.getClass(), "head", null);
        setLongField(term1991, term1991.getClass(), "queueLength", -7672528020740371001L);
        setField(term1990, term1990.getClass(), "queue", term1991);
        setField(term1990, term1990.getClass(), "next", null);
        setField(term1990, term1990.getClass(), "discovered", null);
        setField(term1968, term1968.getClass(), "shadowChildrenRef", term1990);
        setField(term1968, term1968.getClass(), "childNodes", term1994);
        setIntField(term1998, term1998.getClass(), "size", -1048298087);
        setField(term1998, term1998.getClass(), "keys", term2000);
        setField(term1998, term1998.getClass(), "vals", term2001);
        setField(term1968, term1968.getClass(), "attributes", term1998);
        setField(term1968, term1968.getClass(), "baseUri", "uWHnvSvaPl");
        setField(term1968, term1968.getClass(), "parentNode", null);
        setIntField(term1968, term1968.getClass(), "siblingIndex", 292681826);
        ArrayList term63495 = new ArrayList();
        ((ArrayList) term63495).add((Object)null);
        ((ArrayList) term63495).add((Object)null);
        ((ArrayList) term63495).add((Object)null);
        ((ArrayList) term63495).add((Object)null);
        ((ArrayList) term63495).add((Object)null);
        term63488 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term63489 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term63492 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term63493 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term63494 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term63497 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term63498 = (Object[]) newArray("java.lang.String", 0);
        Object[] term63499 = (Object[]) newArray("java.lang.String", 0);
        setField(term63489, term63489.getClass(), "tagName", "fhkbdRViHi");
        setBooleanField(term63489, term63489.getClass(), "isBlock", true);
        setBooleanField(term63489, term63489.getClass(), "formatAsBlock", false);
        setBooleanField(term63489, term63489.getClass(), "canContainInline", true);
        setBooleanField(term63489, term63489.getClass(), "empty", true);
        setBooleanField(term63489, term63489.getClass(), "selfClosing", true);
        setBooleanField(term63489, term63489.getClass(), "preserveWhitespace", true);
        setBooleanField(term63489, term63489.getClass(), "formList", true);
        setBooleanField(term63489, term63489.getClass(), "formSubmit", false);
        setField(term63488, term63488.getClass(), "tag", term63489);
        setField(term63492, term63492.getClass(), "referent", null);
        setField(term63493, term63493.getClass(), "lock", term63494);
        setField(term63493, term63493.getClass(), "head", null);
        setLongField(term63493, term63493.getClass(), "queueLength", -7672528020740371001L);
        setField(term63492, term63492.getClass(), "queue", term63493);
        setField(term63492, term63492.getClass(), "next", null);
        setField(term63492, term63492.getClass(), "discovered", null);
        setField(term63488, term63488.getClass(), "shadowChildrenRef", term63492);
        setField(term63488, term63488.getClass(), "childNodes", term63495);
        setIntField(term63497, term63497.getClass(), "size", -1048298087);
        setField(term63497, term63497.getClass(), "keys", term63498);
        setField(term63497, term63497.getClass(), "vals", term63499);
        setField(term63488, term63488.getClass(), "attributes", term63497);
        setField(term63488, term63488.getClass(), "baseUri", "uWHnvSvaPl");
        setField(term63488, term63488.getClass(), "parentNode", null);
        setIntField(term63488, term63488.getClass(), "siblingIndex", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "is", argTypes, term1968, args);
        assertTrue(recursiveEquals(term1968, term63488));
    }

};


