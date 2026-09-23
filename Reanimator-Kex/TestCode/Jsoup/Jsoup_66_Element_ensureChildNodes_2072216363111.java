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

public class Element_ensureChildNodes_2072216363111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term9794;
     Object term9747;

    public Element_ensureChildNodes_2072216363111() {
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
        ArrayList term9801 = new ArrayList();
        ((ArrayList) term9801).add((Object)null);
        ((ArrayList) term9801).add((Object)null);
        ((ArrayList) term9801).add((Object)null);
        ((ArrayList) term9801).add((Object)null);
        ((ArrayList) term9801).add((Object)null);
        term9794 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9795 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9798 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term9799 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9800 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term9803 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9804 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9805 = (Object[]) newArray("java.lang.String", 0);
        setField(term9795, term9795.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term9795, term9795.getClass(), "isBlock", true);
        setBooleanField(term9795, term9795.getClass(), "formatAsBlock", true);
        setBooleanField(term9795, term9795.getClass(), "canContainInline", false);
        setBooleanField(term9795, term9795.getClass(), "empty", false);
        setBooleanField(term9795, term9795.getClass(), "selfClosing", true);
        setBooleanField(term9795, term9795.getClass(), "preserveWhitespace", true);
        setBooleanField(term9795, term9795.getClass(), "formList", true);
        setBooleanField(term9795, term9795.getClass(), "formSubmit", true);
        setField(term9794, term9794.getClass(), "tag", term9795);
        setField(term9798, term9798.getClass(), "referent", null);
        setField(term9799, term9799.getClass(), "lock", term9800);
        setField(term9799, term9799.getClass(), "head", null);
        setLongField(term9799, term9799.getClass(), "queueLength", 2442117782898005296L);
        setField(term9798, term9798.getClass(), "queue", term9799);
        setField(term9798, term9798.getClass(), "next", null);
        setField(term9798, term9798.getClass(), "discovered", null);
        setField(term9794, term9794.getClass(), "shadowChildrenRef", term9798);
        setField(term9794, term9794.getClass(), "childNodes", term9801);
        setIntField(term9803, term9803.getClass(), "size", 1162663216);
        setField(term9803, term9803.getClass(), "keys", term9804);
        setField(term9803, term9803.getClass(), "vals", term9805);
        setField(term9794, term9794.getClass(), "attributes", term9803);
        setField(term9794, term9794.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term9794, term9794.getClass(), "parentNode", null);
        setIntField(term9794, term9794.getClass(), "siblingIndex", 1484323161);
        term9747 = new ArrayList();
        ((ArrayList) term9747).add((Object)null);
        ((ArrayList) term9747).add((Object)null);
        ((ArrayList) term9747).add((Object)null);
        ((ArrayList) term9747).add((Object)null);
        ((ArrayList) term9747).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "ensureChildNodes", argTypes, term133, args);
        assertTrue(recursiveEquals(term133, term9794));
        assertTrue(recursiveEquals(retValue, term9747));
    }

};


