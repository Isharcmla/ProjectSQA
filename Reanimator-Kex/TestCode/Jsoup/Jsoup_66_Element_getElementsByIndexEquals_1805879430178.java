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
import java.lang.Integer;

public class Element_getElementsByIndexEquals_1805879430178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5445;
     Object term5492;
     Object term33084;
     Object term33080;

    public Element_getElementsByIndexEquals_1805879430178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5471 = new ArrayList();
        ((ArrayList) term5471).add((Object)null);
        ((ArrayList) term5471).add((Object)null);
        ((ArrayList) term5471).add((Object)null);
        ((ArrayList) term5471).add((Object)null);
        ((ArrayList) term5471).add((Object)null);
        term5445 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5446 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5467 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5468 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5469 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5475 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5477 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5478 = (Object[]) newArray("java.lang.String", 0);
        setField(term5446, term5446.getClass(), "tagName", "igCAtimmYB");
        setBooleanField(term5446, term5446.getClass(), "isBlock", true);
        setBooleanField(term5446, term5446.getClass(), "formatAsBlock", false);
        setBooleanField(term5446, term5446.getClass(), "canContainInline", false);
        setBooleanField(term5446, term5446.getClass(), "empty", false);
        setBooleanField(term5446, term5446.getClass(), "selfClosing", true);
        setBooleanField(term5446, term5446.getClass(), "preserveWhitespace", false);
        setBooleanField(term5446, term5446.getClass(), "formList", true);
        setBooleanField(term5446, term5446.getClass(), "formSubmit", false);
        setField(term5445, term5445.getClass(), "tag", term5446);
        setField(term5467, term5467.getClass(), "referent", null);
        setField(term5468, term5468.getClass(), "lock", term5469);
        setField(term5468, term5468.getClass(), "head", null);
        setLongField(term5468, term5468.getClass(), "queueLength", 305759998609888272L);
        setField(term5467, term5467.getClass(), "queue", term5468);
        setField(term5467, term5467.getClass(), "next", null);
        setField(term5467, term5467.getClass(), "discovered", null);
        setField(term5445, term5445.getClass(), "shadowChildrenRef", term5467);
        setField(term5445, term5445.getClass(), "childNodes", term5471);
        setIntField(term5475, term5475.getClass(), "size", 1953277050);
        setField(term5475, term5475.getClass(), "keys", term5477);
        setField(term5475, term5475.getClass(), "vals", term5478);
        setField(term5445, term5445.getClass(), "attributes", term5475);
        setField(term5445, term5445.getClass(), "baseUri", "DyiXbeYIaN");
        setField(term5445, term5445.getClass(), "parentNode", null);
        setIntField(term5445, term5445.getClass(), "siblingIndex", 1283079251);
        term5492 = new Integer(-523949691);
        ArrayList term33091 = new ArrayList();
        ((ArrayList) term33091).add((Object)null);
        ((ArrayList) term33091).add((Object)null);
        ((ArrayList) term33091).add((Object)null);
        ((ArrayList) term33091).add((Object)null);
        ((ArrayList) term33091).add((Object)null);
        term33084 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term33085 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term33088 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term33089 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term33090 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term33093 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term33094 = (Object[]) newArray("java.lang.String", 0);
        Object[] term33095 = (Object[]) newArray("java.lang.String", 0);
        setField(term33085, term33085.getClass(), "tagName", "igCAtimmYB");
        setBooleanField(term33085, term33085.getClass(), "isBlock", true);
        setBooleanField(term33085, term33085.getClass(), "formatAsBlock", false);
        setBooleanField(term33085, term33085.getClass(), "canContainInline", false);
        setBooleanField(term33085, term33085.getClass(), "empty", false);
        setBooleanField(term33085, term33085.getClass(), "selfClosing", true);
        setBooleanField(term33085, term33085.getClass(), "preserveWhitespace", false);
        setBooleanField(term33085, term33085.getClass(), "formList", true);
        setBooleanField(term33085, term33085.getClass(), "formSubmit", false);
        setField(term33084, term33084.getClass(), "tag", term33085);
        setField(term33088, term33088.getClass(), "referent", null);
        setField(term33089, term33089.getClass(), "lock", term33090);
        setField(term33089, term33089.getClass(), "head", null);
        setLongField(term33089, term33089.getClass(), "queueLength", 305759998609888272L);
        setField(term33088, term33088.getClass(), "queue", term33089);
        setField(term33088, term33088.getClass(), "next", null);
        setField(term33088, term33088.getClass(), "discovered", null);
        setField(term33084, term33084.getClass(), "shadowChildrenRef", term33088);
        setField(term33084, term33084.getClass(), "childNodes", term33091);
        setIntField(term33093, term33093.getClass(), "size", 1953277050);
        setField(term33093, term33093.getClass(), "keys", term33094);
        setField(term33093, term33093.getClass(), "vals", term33095);
        setField(term33084, term33084.getClass(), "attributes", term33093);
        setField(term33084, term33084.getClass(), "baseUri", "DyiXbeYIaN");
        setField(term33084, term33084.getClass(), "parentNode", null);
        setIntField(term33084, term33084.getClass(), "siblingIndex", 1283079251);
        term33080 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term33081 = (Object[]) newArray("java.lang.Object", 0);
        setField(term33080, term33080.getClass(), "elementData", term33081);
        setIntField(term33080, term33080.getClass(), "size", 0);
        setIntField(term33080, term33080.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5492;
        Object retValue = callMethod(klass, "getElementsByIndexEquals", argTypes, term5445, args);
        assertTrue(recursiveEquals(term5445, term33084));
        assertTrue(recursiveEquals(term5492, -523949691));
        assertTrue(recursiveEquals(retValue, term33080));
    }

};


