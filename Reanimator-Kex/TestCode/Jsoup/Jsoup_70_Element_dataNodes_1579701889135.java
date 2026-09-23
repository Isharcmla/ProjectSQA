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

public class Element_dataNodes_1579701889135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;
     Object term60178;
     Object term60126;

    public Element_dataNodes_1579701889135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1749 = new ArrayList();
        ((ArrayList) term1749).add((Object)null);
        ((ArrayList) term1749).add((Object)null);
        ((ArrayList) term1749).add((Object)null);
        term1723 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1724 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1745 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1746 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1747 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1753 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1755 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1756 = (Object[]) newArray("java.lang.String", 0);
        setField(term1724, term1724.getClass(), "tagName", "ffYhPOzlUs");
        setBooleanField(term1724, term1724.getClass(), "isBlock", false);
        setBooleanField(term1724, term1724.getClass(), "formatAsBlock", true);
        setBooleanField(term1724, term1724.getClass(), "canContainInline", false);
        setBooleanField(term1724, term1724.getClass(), "empty", false);
        setBooleanField(term1724, term1724.getClass(), "selfClosing", true);
        setBooleanField(term1724, term1724.getClass(), "preserveWhitespace", true);
        setBooleanField(term1724, term1724.getClass(), "formList", false);
        setBooleanField(term1724, term1724.getClass(), "formSubmit", false);
        setField(term1723, term1723.getClass(), "tag", term1724);
        setField(term1745, term1745.getClass(), "referent", null);
        setField(term1746, term1746.getClass(), "lock", term1747);
        setField(term1746, term1746.getClass(), "head", null);
        setLongField(term1746, term1746.getClass(), "queueLength", -4365849114644724155L);
        setField(term1745, term1745.getClass(), "queue", term1746);
        setField(term1745, term1745.getClass(), "next", null);
        setField(term1745, term1745.getClass(), "discovered", null);
        setField(term1723, term1723.getClass(), "shadowChildrenRef", term1745);
        setField(term1723, term1723.getClass(), "childNodes", term1749);
        setIntField(term1753, term1753.getClass(), "size", 579005622);
        setField(term1753, term1753.getClass(), "keys", term1755);
        setField(term1753, term1753.getClass(), "vals", term1756);
        setField(term1723, term1723.getClass(), "attributes", term1753);
        setField(term1723, term1723.getClass(), "baseUri", "MLqYREekMl");
        setField(term1723, term1723.getClass(), "parentNode", null);
        setIntField(term1723, term1723.getClass(), "siblingIndex", -14890619);
        ArrayList term60185 = new ArrayList();
        ((ArrayList) term60185).add((Object)null);
        ((ArrayList) term60185).add((Object)null);
        ((ArrayList) term60185).add((Object)null);
        term60178 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term60179 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60182 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term60183 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term60184 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term60187 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60188 = (Object[]) newArray("java.lang.String", 0);
        Object[] term60189 = (Object[]) newArray("java.lang.String", 0);
        setField(term60179, term60179.getClass(), "tagName", "ffYhPOzlUs");
        setBooleanField(term60179, term60179.getClass(), "isBlock", false);
        setBooleanField(term60179, term60179.getClass(), "formatAsBlock", true);
        setBooleanField(term60179, term60179.getClass(), "canContainInline", false);
        setBooleanField(term60179, term60179.getClass(), "empty", false);
        setBooleanField(term60179, term60179.getClass(), "selfClosing", true);
        setBooleanField(term60179, term60179.getClass(), "preserveWhitespace", true);
        setBooleanField(term60179, term60179.getClass(), "formList", false);
        setBooleanField(term60179, term60179.getClass(), "formSubmit", false);
        setField(term60178, term60178.getClass(), "tag", term60179);
        setField(term60182, term60182.getClass(), "referent", null);
        setField(term60183, term60183.getClass(), "lock", term60184);
        setField(term60183, term60183.getClass(), "head", null);
        setLongField(term60183, term60183.getClass(), "queueLength", -4365849114644724155L);
        setField(term60182, term60182.getClass(), "queue", term60183);
        setField(term60182, term60182.getClass(), "next", null);
        setField(term60182, term60182.getClass(), "discovered", null);
        setField(term60178, term60178.getClass(), "shadowChildrenRef", term60182);
        setField(term60178, term60178.getClass(), "childNodes", term60185);
        setIntField(term60187, term60187.getClass(), "size", 579005622);
        setField(term60187, term60187.getClass(), "keys", term60188);
        setField(term60187, term60187.getClass(), "vals", term60189);
        setField(term60178, term60178.getClass(), "attributes", term60187);
        setField(term60178, term60178.getClass(), "baseUri", "MLqYREekMl");
        setField(term60178, term60178.getClass(), "parentNode", null);
        setIntField(term60178, term60178.getClass(), "siblingIndex", -14890619);
        ArrayList term60127 = new ArrayList();
        term60126 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term60126, term60126.getClass(), "list", term60127);
        setField(term60126, term60126.getClass(), "c", term60127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1723, args);
        assertTrue(recursiveEquals(term1723, term60178));
        assertTrue(recursiveEquals(retValue, term60126));
    }

};


