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

public class Element_is_2062761729137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1968;
     Object term16084;

    public Element_is_2062761729137() {
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
        setBooleanField(term1969, term1969.getClass(), "isBlock", false);
        setBooleanField(term1969, term1969.getClass(), "formatAsBlock", true);
        setBooleanField(term1969, term1969.getClass(), "canContainInline", true);
        setBooleanField(term1969, term1969.getClass(), "empty", true);
        setBooleanField(term1969, term1969.getClass(), "selfClosing", true);
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
        ArrayList term16091 = new ArrayList();
        ((ArrayList) term16091).add((Object)null);
        ((ArrayList) term16091).add((Object)null);
        ((ArrayList) term16091).add((Object)null);
        ((ArrayList) term16091).add((Object)null);
        ((ArrayList) term16091).add((Object)null);
        term16084 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term16085 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term16088 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term16089 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term16090 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term16093 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term16094 = (Object[]) newArray("java.lang.String", 0);
        Object[] term16095 = (Object[]) newArray("java.lang.String", 0);
        setField(term16085, term16085.getClass(), "tagName", "fhkbdRViHi");
        setBooleanField(term16085, term16085.getClass(), "isBlock", false);
        setBooleanField(term16085, term16085.getClass(), "formatAsBlock", true);
        setBooleanField(term16085, term16085.getClass(), "canContainInline", true);
        setBooleanField(term16085, term16085.getClass(), "empty", true);
        setBooleanField(term16085, term16085.getClass(), "selfClosing", true);
        setBooleanField(term16085, term16085.getClass(), "preserveWhitespace", true);
        setBooleanField(term16085, term16085.getClass(), "formList", false);
        setBooleanField(term16085, term16085.getClass(), "formSubmit", false);
        setField(term16084, term16084.getClass(), "tag", term16085);
        setField(term16088, term16088.getClass(), "referent", null);
        setField(term16089, term16089.getClass(), "lock", term16090);
        setField(term16089, term16089.getClass(), "head", null);
        setLongField(term16089, term16089.getClass(), "queueLength", -7672528020740371001L);
        setField(term16088, term16088.getClass(), "queue", term16089);
        setField(term16088, term16088.getClass(), "next", null);
        setField(term16088, term16088.getClass(), "discovered", null);
        setField(term16084, term16084.getClass(), "shadowChildrenRef", term16088);
        setField(term16084, term16084.getClass(), "childNodes", term16091);
        setIntField(term16093, term16093.getClass(), "size", -1048298087);
        setField(term16093, term16093.getClass(), "keys", term16094);
        setField(term16093, term16093.getClass(), "vals", term16095);
        setField(term16084, term16084.getClass(), "attributes", term16093);
        setField(term16084, term16084.getClass(), "baseUri", "uWHnvSvaPl");
        setField(term16084, term16084.getClass(), "parentNode", null);
        setIntField(term16084, term16084.getClass(), "siblingIndex", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "is", argTypes, term1968, args);
        assertTrue(recursiveEquals(term1968, term16084));
    }

};


