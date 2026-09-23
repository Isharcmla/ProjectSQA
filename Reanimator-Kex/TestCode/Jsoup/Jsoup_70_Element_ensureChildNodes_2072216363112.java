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

public class Element_ensureChildNodes_2072216363112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term56218;
     Object term56171;

    public Element_ensureChildNodes_2072216363112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term159 = new ArrayList();
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        ((ArrayList) term159).add((Object)null);
        term133 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term155 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term156 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term157 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term163 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term165 = (Object[]) newArray("java.lang.String", 0);
        Object[] term166 = (Object[]) newArray("java.lang.String", 0);
        setField(term134, term134.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term134, term134.getClass(), "isBlock", true);
        setBooleanField(term134, term134.getClass(), "formatAsBlock", true);
        setBooleanField(term134, term134.getClass(), "canContainInline", false);
        setBooleanField(term134, term134.getClass(), "empty", false);
        setBooleanField(term134, term134.getClass(), "selfClosing", true);
        setBooleanField(term134, term134.getClass(), "preserveWhitespace", true);
        setBooleanField(term134, term134.getClass(), "formList", true);
        setBooleanField(term134, term134.getClass(), "formSubmit", true);
        setField(term133, term133.getClass(), "tag", term134);
        setField(term155, term155.getClass(), "referent", null);
        setField(term156, term156.getClass(), "lock", term157);
        setField(term156, term156.getClass(), "head", null);
        setLongField(term156, term156.getClass(), "queueLength", 2442117782898005296L);
        setField(term155, term155.getClass(), "queue", term156);
        setField(term155, term155.getClass(), "next", null);
        setField(term155, term155.getClass(), "discovered", null);
        setField(term133, term133.getClass(), "shadowChildrenRef", term155);
        setField(term133, term133.getClass(), "childNodes", term159);
        setIntField(term163, term163.getClass(), "size", 1162663216);
        setField(term163, term163.getClass(), "keys", term165);
        setField(term163, term163.getClass(), "vals", term166);
        setField(term133, term133.getClass(), "attributes", term163);
        setField(term133, term133.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term133, term133.getClass(), "parentNode", null);
        setIntField(term133, term133.getClass(), "siblingIndex", 1484323161);
        ArrayList term56225 = new ArrayList();
        ((ArrayList) term56225).add((Object)null);
        ((ArrayList) term56225).add((Object)null);
        ((ArrayList) term56225).add((Object)null);
        ((ArrayList) term56225).add((Object)null);
        ((ArrayList) term56225).add((Object)null);
        term56218 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56219 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56222 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56223 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56224 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56227 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56228 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56229 = (Object[]) newArray("java.lang.String", 0);
        setField(term56219, term56219.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term56219, term56219.getClass(), "isBlock", true);
        setBooleanField(term56219, term56219.getClass(), "formatAsBlock", true);
        setBooleanField(term56219, term56219.getClass(), "canContainInline", false);
        setBooleanField(term56219, term56219.getClass(), "empty", false);
        setBooleanField(term56219, term56219.getClass(), "selfClosing", true);
        setBooleanField(term56219, term56219.getClass(), "preserveWhitespace", true);
        setBooleanField(term56219, term56219.getClass(), "formList", true);
        setBooleanField(term56219, term56219.getClass(), "formSubmit", true);
        setField(term56218, term56218.getClass(), "tag", term56219);
        setField(term56222, term56222.getClass(), "referent", null);
        setField(term56223, term56223.getClass(), "lock", term56224);
        setField(term56223, term56223.getClass(), "head", null);
        setLongField(term56223, term56223.getClass(), "queueLength", 2442117782898005296L);
        setField(term56222, term56222.getClass(), "queue", term56223);
        setField(term56222, term56222.getClass(), "next", null);
        setField(term56222, term56222.getClass(), "discovered", null);
        setField(term56218, term56218.getClass(), "shadowChildrenRef", term56222);
        setField(term56218, term56218.getClass(), "childNodes", term56225);
        setIntField(term56227, term56227.getClass(), "size", 1162663216);
        setField(term56227, term56227.getClass(), "keys", term56228);
        setField(term56227, term56227.getClass(), "vals", term56229);
        setField(term56218, term56218.getClass(), "attributes", term56227);
        setField(term56218, term56218.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term56218, term56218.getClass(), "parentNode", null);
        setIntField(term56218, term56218.getClass(), "siblingIndex", 1484323161);
        term56171 = new ArrayList();
        ((ArrayList) term56171).add((Object)null);
        ((ArrayList) term56171).add((Object)null);
        ((ArrayList) term56171).add((Object)null);
        ((ArrayList) term56171).add((Object)null);
        ((ArrayList) term56171).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "ensureChildNodes", argTypes, term133, args);
        assertTrue(recursiveEquals(term133, term56218));
        assertTrue(recursiveEquals(retValue, term56171));
    }

};


