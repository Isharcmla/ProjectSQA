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

public class Element_siblingElements_1319765476157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535;
     Object term24445;
     Object term24394;

    public Element_siblingElements_1319765476157() {
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
        setBooleanField(term3536, term3536.getClass(), "isBlock", true);
        setBooleanField(term3536, term3536.getClass(), "formatAsBlock", true);
        setBooleanField(term3536, term3536.getClass(), "canContainInline", true);
        setBooleanField(term3536, term3536.getClass(), "empty", false);
        setBooleanField(term3536, term3536.getClass(), "selfClosing", false);
        setBooleanField(term3536, term3536.getClass(), "preserveWhitespace", false);
        setBooleanField(term3536, term3536.getClass(), "formList", true);
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
        ArrayList term24452 = new ArrayList();
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        ((ArrayList) term24452).add((Object)null);
        term24445 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24446 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24449 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term24450 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term24451 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term24454 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term24455 = (Object[]) newArray("java.lang.String", 0);
        Object[] term24456 = (Object[]) newArray("java.lang.String", 0);
        setField(term24446, term24446.getClass(), "tagName", "iNwOJRBEjp");
        setBooleanField(term24446, term24446.getClass(), "isBlock", true);
        setBooleanField(term24446, term24446.getClass(), "formatAsBlock", true);
        setBooleanField(term24446, term24446.getClass(), "canContainInline", true);
        setBooleanField(term24446, term24446.getClass(), "empty", false);
        setBooleanField(term24446, term24446.getClass(), "selfClosing", false);
        setBooleanField(term24446, term24446.getClass(), "preserveWhitespace", false);
        setBooleanField(term24446, term24446.getClass(), "formList", true);
        setBooleanField(term24446, term24446.getClass(), "formSubmit", false);
        setField(term24445, term24445.getClass(), "tag", term24446);
        setField(term24449, term24449.getClass(), "referent", null);
        setField(term24450, term24450.getClass(), "lock", term24451);
        setField(term24450, term24450.getClass(), "head", null);
        setLongField(term24450, term24450.getClass(), "queueLength", 4044358158040652353L);
        setField(term24449, term24449.getClass(), "queue", term24450);
        setField(term24449, term24449.getClass(), "next", null);
        setField(term24449, term24449.getClass(), "discovered", null);
        setField(term24445, term24445.getClass(), "shadowChildrenRef", term24449);
        setField(term24445, term24445.getClass(), "childNodes", term24452);
        setIntField(term24454, term24454.getClass(), "size", -894662986);
        setField(term24454, term24454.getClass(), "keys", term24455);
        setField(term24454, term24454.getClass(), "vals", term24456);
        setField(term24445, term24445.getClass(), "attributes", term24454);
        setField(term24445, term24445.getClass(), "baseUri", "XylxrMBraH");
        setField(term24445, term24445.getClass(), "parentNode", null);
        setIntField(term24445, term24445.getClass(), "siblingIndex", 304775596);
        term24394 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term24395 = (Object[]) newArray("java.lang.Object", 0);
        setField(term24394, term24394.getClass(), "elementData", term24395);
        setIntField(term24394, term24394.getClass(), "size", 0);
        setIntField(term24394, term24394.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "siblingElements", argTypes, term3535, args);
        assertTrue(recursiveEquals(term3535, term24445));
        assertTrue(recursiveEquals(retValue, term24394));
    }

};


