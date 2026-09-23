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

public class Element_getElementsByIndexEquals_1805879430181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5445;
     Object term5492;
     Object term252032;
     Object term252028;

    public Element_getElementsByIndexEquals_1805879430181() {
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
        setBooleanField(term5446, term5446.getClass(), "isBlock", false);
        setBooleanField(term5446, term5446.getClass(), "formatAsBlock", true);
        setBooleanField(term5446, term5446.getClass(), "canContainInline", false);
        setBooleanField(term5446, term5446.getClass(), "empty", true);
        setBooleanField(term5446, term5446.getClass(), "selfClosing", false);
        setBooleanField(term5446, term5446.getClass(), "preserveWhitespace", true);
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
        ArrayList term252039 = new ArrayList();
        ((ArrayList) term252039).add((Object)null);
        ((ArrayList) term252039).add((Object)null);
        ((ArrayList) term252039).add((Object)null);
        ((ArrayList) term252039).add((Object)null);
        ((ArrayList) term252039).add((Object)null);
        term252032 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term252033 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term252036 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term252037 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term252038 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term252041 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term252042 = (Object[]) newArray("java.lang.String", 0);
        Object[] term252043 = (Object[]) newArray("java.lang.String", 0);
        setField(term252033, term252033.getClass(), "tagName", "igCAtimmYB");
        setBooleanField(term252033, term252033.getClass(), "isBlock", false);
        setBooleanField(term252033, term252033.getClass(), "formatAsBlock", true);
        setBooleanField(term252033, term252033.getClass(), "canContainInline", false);
        setBooleanField(term252033, term252033.getClass(), "empty", true);
        setBooleanField(term252033, term252033.getClass(), "selfClosing", false);
        setBooleanField(term252033, term252033.getClass(), "preserveWhitespace", true);
        setBooleanField(term252033, term252033.getClass(), "formList", true);
        setBooleanField(term252033, term252033.getClass(), "formSubmit", false);
        setField(term252032, term252032.getClass(), "tag", term252033);
        setField(term252036, term252036.getClass(), "referent", null);
        setField(term252037, term252037.getClass(), "lock", term252038);
        setField(term252037, term252037.getClass(), "head", null);
        setLongField(term252037, term252037.getClass(), "queueLength", 305759998609888272L);
        setField(term252036, term252036.getClass(), "queue", term252037);
        setField(term252036, term252036.getClass(), "next", null);
        setField(term252036, term252036.getClass(), "discovered", null);
        setField(term252032, term252032.getClass(), "shadowChildrenRef", term252036);
        setField(term252032, term252032.getClass(), "childNodes", term252039);
        setIntField(term252041, term252041.getClass(), "size", 1953277050);
        setField(term252041, term252041.getClass(), "keys", term252042);
        setField(term252041, term252041.getClass(), "vals", term252043);
        setField(term252032, term252032.getClass(), "attributes", term252041);
        setField(term252032, term252032.getClass(), "baseUri", "DyiXbeYIaN");
        setField(term252032, term252032.getClass(), "parentNode", null);
        setIntField(term252032, term252032.getClass(), "siblingIndex", 1283079251);
        term252028 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term252029 = (Object[]) newArray("java.lang.Object", 0);
        setField(term252028, term252028.getClass(), "elementData", term252029);
        setIntField(term252028, term252028.getClass(), "size", 0);
        setIntField(term252028, term252028.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5492;
        Object retValue = callMethod(klass, "getElementsByIndexEquals", argTypes, term5445, args);
        assertTrue(recursiveEquals(term5445, term252032));
        assertTrue(recursiveEquals(term5492, -523949691));
        assertTrue(recursiveEquals(retValue, term252028));
    }

};


