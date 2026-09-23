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

public class Element_dataNodes_1579701889137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;
     Object term61136;
     Object term61084;

    public Element_dataNodes_1579701889137() {
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
        setBooleanField(term1724, term1724.getClass(), "canContainInline", true);
        setBooleanField(term1724, term1724.getClass(), "empty", false);
        setBooleanField(term1724, term1724.getClass(), "selfClosing", false);
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
        ArrayList term61143 = new ArrayList();
        ((ArrayList) term61143).add((Object)null);
        ((ArrayList) term61143).add((Object)null);
        ((ArrayList) term61143).add((Object)null);
        term61136 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term61137 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term61140 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term61141 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term61142 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term61145 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term61146 = (Object[]) newArray("java.lang.String", 0);
        Object[] term61147 = (Object[]) newArray("java.lang.String", 0);
        setField(term61137, term61137.getClass(), "tagName", "ffYhPOzlUs");
        setBooleanField(term61137, term61137.getClass(), "isBlock", false);
        setBooleanField(term61137, term61137.getClass(), "formatAsBlock", true);
        setBooleanField(term61137, term61137.getClass(), "canContainInline", true);
        setBooleanField(term61137, term61137.getClass(), "empty", false);
        setBooleanField(term61137, term61137.getClass(), "selfClosing", false);
        setBooleanField(term61137, term61137.getClass(), "preserveWhitespace", true);
        setBooleanField(term61137, term61137.getClass(), "formList", false);
        setBooleanField(term61137, term61137.getClass(), "formSubmit", false);
        setField(term61136, term61136.getClass(), "tag", term61137);
        setField(term61140, term61140.getClass(), "referent", null);
        setField(term61141, term61141.getClass(), "lock", term61142);
        setField(term61141, term61141.getClass(), "head", null);
        setLongField(term61141, term61141.getClass(), "queueLength", -4365849114644724155L);
        setField(term61140, term61140.getClass(), "queue", term61141);
        setField(term61140, term61140.getClass(), "next", null);
        setField(term61140, term61140.getClass(), "discovered", null);
        setField(term61136, term61136.getClass(), "shadowChildrenRef", term61140);
        setField(term61136, term61136.getClass(), "childNodes", term61143);
        setIntField(term61145, term61145.getClass(), "size", 579005622);
        setField(term61145, term61145.getClass(), "keys", term61146);
        setField(term61145, term61145.getClass(), "vals", term61147);
        setField(term61136, term61136.getClass(), "attributes", term61145);
        setField(term61136, term61136.getClass(), "baseUri", "MLqYREekMl");
        setField(term61136, term61136.getClass(), "parentNode", null);
        setIntField(term61136, term61136.getClass(), "siblingIndex", -14890619);
        ArrayList term61085 = new ArrayList();
        term61084 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term61084, term61084.getClass(), "list", term61085);
        setField(term61084, term61084.getClass(), "c", term61085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1723, args);
        assertTrue(recursiveEquals(term1723, term61136));
        assertTrue(recursiveEquals(retValue, term61084));
    }

};


