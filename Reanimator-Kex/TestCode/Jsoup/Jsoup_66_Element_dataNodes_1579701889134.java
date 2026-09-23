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

public class Element_dataNodes_1579701889134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;
     Object term13732;
     Object term13680;

    public Element_dataNodes_1579701889134() {
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
        setBooleanField(term1724, term1724.getClass(), "isBlock", true);
        setBooleanField(term1724, term1724.getClass(), "formatAsBlock", true);
        setBooleanField(term1724, term1724.getClass(), "canContainInline", false);
        setBooleanField(term1724, term1724.getClass(), "empty", false);
        setBooleanField(term1724, term1724.getClass(), "selfClosing", true);
        setBooleanField(term1724, term1724.getClass(), "preserveWhitespace", false);
        setBooleanField(term1724, term1724.getClass(), "formList", false);
        setBooleanField(term1724, term1724.getClass(), "formSubmit", true);
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
        ArrayList term13739 = new ArrayList();
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        term13732 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term13733 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13736 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term13737 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term13738 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term13741 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13742 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13743 = (Object[]) newArray("java.lang.String", 0);
        setField(term13733, term13733.getClass(), "tagName", "ffYhPOzlUs");
        setBooleanField(term13733, term13733.getClass(), "isBlock", true);
        setBooleanField(term13733, term13733.getClass(), "formatAsBlock", true);
        setBooleanField(term13733, term13733.getClass(), "canContainInline", false);
        setBooleanField(term13733, term13733.getClass(), "empty", false);
        setBooleanField(term13733, term13733.getClass(), "selfClosing", true);
        setBooleanField(term13733, term13733.getClass(), "preserveWhitespace", false);
        setBooleanField(term13733, term13733.getClass(), "formList", false);
        setBooleanField(term13733, term13733.getClass(), "formSubmit", true);
        setField(term13732, term13732.getClass(), "tag", term13733);
        setField(term13736, term13736.getClass(), "referent", null);
        setField(term13737, term13737.getClass(), "lock", term13738);
        setField(term13737, term13737.getClass(), "head", null);
        setLongField(term13737, term13737.getClass(), "queueLength", -4365849114644724155L);
        setField(term13736, term13736.getClass(), "queue", term13737);
        setField(term13736, term13736.getClass(), "next", null);
        setField(term13736, term13736.getClass(), "discovered", null);
        setField(term13732, term13732.getClass(), "shadowChildrenRef", term13736);
        setField(term13732, term13732.getClass(), "childNodes", term13739);
        setIntField(term13741, term13741.getClass(), "size", 579005622);
        setField(term13741, term13741.getClass(), "keys", term13742);
        setField(term13741, term13741.getClass(), "vals", term13743);
        setField(term13732, term13732.getClass(), "attributes", term13741);
        setField(term13732, term13732.getClass(), "baseUri", "MLqYREekMl");
        setField(term13732, term13732.getClass(), "parentNode", null);
        setIntField(term13732, term13732.getClass(), "siblingIndex", -14890619);
        ArrayList term13681 = new ArrayList();
        term13680 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term13680, term13680.getClass(), "list", term13681);
        setField(term13680, term13680.getClass(), "c", term13681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1723, args);
        assertTrue(recursiveEquals(term1723, term13732));
        assertTrue(recursiveEquals(retValue, term13680));
    }

};


