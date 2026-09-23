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

public class Element_is_2062761729138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1968;
     Object term62530;

    public Element_is_2062761729138() {
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
        setBooleanField(term1969, term1969.getClass(), "formatAsBlock", true);
        setBooleanField(term1969, term1969.getClass(), "canContainInline", true);
        setBooleanField(term1969, term1969.getClass(), "empty", false);
        setBooleanField(term1969, term1969.getClass(), "selfClosing", false);
        setBooleanField(term1969, term1969.getClass(), "preserveWhitespace", true);
        setBooleanField(term1969, term1969.getClass(), "formList", false);
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
        ArrayList term62537 = new ArrayList();
        ((ArrayList) term62537).add((Object)null);
        ((ArrayList) term62537).add((Object)null);
        ((ArrayList) term62537).add((Object)null);
        ((ArrayList) term62537).add((Object)null);
        ((ArrayList) term62537).add((Object)null);
        term62530 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term62531 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term62534 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term62535 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term62536 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term62539 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term62540 = (Object[]) newArray("java.lang.String", 0);
        Object[] term62541 = (Object[]) newArray("java.lang.String", 0);
        setField(term62531, term62531.getClass(), "tagName", "fhkbdRViHi");
        setBooleanField(term62531, term62531.getClass(), "isBlock", true);
        setBooleanField(term62531, term62531.getClass(), "formatAsBlock", true);
        setBooleanField(term62531, term62531.getClass(), "canContainInline", true);
        setBooleanField(term62531, term62531.getClass(), "empty", false);
        setBooleanField(term62531, term62531.getClass(), "selfClosing", false);
        setBooleanField(term62531, term62531.getClass(), "preserveWhitespace", true);
        setBooleanField(term62531, term62531.getClass(), "formList", false);
        setBooleanField(term62531, term62531.getClass(), "formSubmit", false);
        setField(term62530, term62530.getClass(), "tag", term62531);
        setField(term62534, term62534.getClass(), "referent", null);
        setField(term62535, term62535.getClass(), "lock", term62536);
        setField(term62535, term62535.getClass(), "head", null);
        setLongField(term62535, term62535.getClass(), "queueLength", -7672528020740371001L);
        setField(term62534, term62534.getClass(), "queue", term62535);
        setField(term62534, term62534.getClass(), "next", null);
        setField(term62534, term62534.getClass(), "discovered", null);
        setField(term62530, term62530.getClass(), "shadowChildrenRef", term62534);
        setField(term62530, term62530.getClass(), "childNodes", term62537);
        setIntField(term62539, term62539.getClass(), "size", -1048298087);
        setField(term62539, term62539.getClass(), "keys", term62540);
        setField(term62539, term62539.getClass(), "vals", term62541);
        setField(term62530, term62530.getClass(), "attributes", term62539);
        setField(term62530, term62530.getClass(), "baseUri", "uWHnvSvaPl");
        setField(term62530, term62530.getClass(), "parentNode", null);
        setIntField(term62530, term62530.getClass(), "siblingIndex", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "is", argTypes, term1968, args);
        assertTrue(recursiveEquals(term1968, term62530));
    }

};


