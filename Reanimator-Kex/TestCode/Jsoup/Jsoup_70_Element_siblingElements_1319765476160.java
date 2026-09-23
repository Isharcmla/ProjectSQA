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

public class Element_siblingElements_1319765476160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535;
     Object term243080;
     Object term243029;

    public Element_siblingElements_1319765476160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3561 = new ArrayList();
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        term3535 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3536 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3557 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3558 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3559 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3565 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3567 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3568 = (Object[]) newArray("java.lang.String", 0);
        setField(term3536, term3536.getClass(), "tagName", "iNwOJRBEjp");
        setBooleanField(term3536, term3536.getClass(), "isBlock", false);
        setBooleanField(term3536, term3536.getClass(), "formatAsBlock", false);
        setBooleanField(term3536, term3536.getClass(), "canContainInline", false);
        setBooleanField(term3536, term3536.getClass(), "empty", true);
        setBooleanField(term3536, term3536.getClass(), "selfClosing", false);
        setBooleanField(term3536, term3536.getClass(), "preserveWhitespace", false);
        setBooleanField(term3536, term3536.getClass(), "formList", false);
        setBooleanField(term3536, term3536.getClass(), "formSubmit", false);
        setField(term3535, term3535.getClass(), "tag", term3536);
        setField(term3557, term3557.getClass(), "referent", null);
        setField(term3558, term3558.getClass(), "lock", term3559);
        setField(term3558, term3558.getClass(), "head", null);
        setLongField(term3558, term3558.getClass(), "queueLength", 4044358158040652353L);
        setField(term3557, term3557.getClass(), "queue", term3558);
        setField(term3557, term3557.getClass(), "next", null);
        setField(term3557, term3557.getClass(), "discovered", null);
        setField(term3535, term3535.getClass(), "shadowChildrenRef", term3557);
        setField(term3535, term3535.getClass(), "childNodes", term3561);
        setIntField(term3565, term3565.getClass(), "size", -894662986);
        setField(term3565, term3565.getClass(), "keys", term3567);
        setField(term3565, term3565.getClass(), "vals", term3568);
        setField(term3535, term3535.getClass(), "attributes", term3565);
        setField(term3535, term3535.getClass(), "baseUri", "XylxrMBraH");
        setField(term3535, term3535.getClass(), "parentNode", null);
        setIntField(term3535, term3535.getClass(), "siblingIndex", 304775596);
        ArrayList term243087 = new ArrayList();
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        ((ArrayList) term243087).add((Object)null);
        term243080 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term243081 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term243084 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term243085 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term243086 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term243089 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term243090 = (Object[]) newArray("java.lang.String", 0);
        Object[] term243091 = (Object[]) newArray("java.lang.String", 0);
        setField(term243081, term243081.getClass(), "tagName", "iNwOJRBEjp");
        setBooleanField(term243081, term243081.getClass(), "isBlock", false);
        setBooleanField(term243081, term243081.getClass(), "formatAsBlock", false);
        setBooleanField(term243081, term243081.getClass(), "canContainInline", false);
        setBooleanField(term243081, term243081.getClass(), "empty", true);
        setBooleanField(term243081, term243081.getClass(), "selfClosing", false);
        setBooleanField(term243081, term243081.getClass(), "preserveWhitespace", false);
        setBooleanField(term243081, term243081.getClass(), "formList", false);
        setBooleanField(term243081, term243081.getClass(), "formSubmit", false);
        setField(term243080, term243080.getClass(), "tag", term243081);
        setField(term243084, term243084.getClass(), "referent", null);
        setField(term243085, term243085.getClass(), "lock", term243086);
        setField(term243085, term243085.getClass(), "head", null);
        setLongField(term243085, term243085.getClass(), "queueLength", 4044358158040652353L);
        setField(term243084, term243084.getClass(), "queue", term243085);
        setField(term243084, term243084.getClass(), "next", null);
        setField(term243084, term243084.getClass(), "discovered", null);
        setField(term243080, term243080.getClass(), "shadowChildrenRef", term243084);
        setField(term243080, term243080.getClass(), "childNodes", term243087);
        setIntField(term243089, term243089.getClass(), "size", -894662986);
        setField(term243089, term243089.getClass(), "keys", term243090);
        setField(term243089, term243089.getClass(), "vals", term243091);
        setField(term243080, term243080.getClass(), "attributes", term243089);
        setField(term243080, term243080.getClass(), "baseUri", "XylxrMBraH");
        setField(term243080, term243080.getClass(), "parentNode", null);
        setIntField(term243080, term243080.getClass(), "siblingIndex", 304775596);
        term243029 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term243030 = (Object[]) newArray("java.lang.Object", 0);
        setField(term243029, term243029.getClass(), "elementData", term243030);
        setIntField(term243029, term243029.getClass(), "size", 0);
        setIntField(term243029, term243029.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "siblingElements", argTypes, term3535, args);
        assertTrue(recursiveEquals(term3535, term243080));
        assertTrue(recursiveEquals(retValue, term243029));
    }

};


