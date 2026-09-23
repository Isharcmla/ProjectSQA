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

public class Element_parent_836683031129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250;
     Object term59778;

    public Element_parent_836683031129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1276 = new ArrayList();
        ((ArrayList) term1276).add((Object)null);
        term1250 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1251 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1272 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1273 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1274 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1280 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1282 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1283 = (Object[]) newArray("java.lang.String", 0);
        setField(term1251, term1251.getClass(), "tagName", "wSQxaModmm");
        setBooleanField(term1251, term1251.getClass(), "isBlock", true);
        setBooleanField(term1251, term1251.getClass(), "formatAsBlock", false);
        setBooleanField(term1251, term1251.getClass(), "canContainInline", false);
        setBooleanField(term1251, term1251.getClass(), "empty", true);
        setBooleanField(term1251, term1251.getClass(), "selfClosing", false);
        setBooleanField(term1251, term1251.getClass(), "preserveWhitespace", false);
        setBooleanField(term1251, term1251.getClass(), "formList", false);
        setBooleanField(term1251, term1251.getClass(), "formSubmit", true);
        setField(term1250, term1250.getClass(), "tag", term1251);
        setField(term1272, term1272.getClass(), "referent", null);
        setField(term1273, term1273.getClass(), "lock", term1274);
        setField(term1273, term1273.getClass(), "head", null);
        setLongField(term1273, term1273.getClass(), "queueLength", -872011222785455006L);
        setField(term1272, term1272.getClass(), "queue", term1273);
        setField(term1272, term1272.getClass(), "next", null);
        setField(term1272, term1272.getClass(), "discovered", null);
        setField(term1250, term1250.getClass(), "shadowChildrenRef", term1272);
        setField(term1250, term1250.getClass(), "childNodes", term1276);
        setIntField(term1280, term1280.getClass(), "size", -1179120542);
        setField(term1280, term1280.getClass(), "keys", term1282);
        setField(term1280, term1280.getClass(), "vals", term1283);
        setField(term1250, term1250.getClass(), "attributes", term1280);
        setField(term1250, term1250.getClass(), "baseUri", "UlajhuVLaP");
        setField(term1250, term1250.getClass(), "parentNode", null);
        setIntField(term1250, term1250.getClass(), "siblingIndex", -73683645);
        ArrayList term59785 = new ArrayList();
        ((ArrayList) term59785).add((Object)null);
        term59778 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term59779 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59782 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term59783 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term59784 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term59787 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59788 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59789 = (Object[]) newArray("java.lang.String", 0);
        setField(term59779, term59779.getClass(), "tagName", "wSQxaModmm");
        setBooleanField(term59779, term59779.getClass(), "isBlock", true);
        setBooleanField(term59779, term59779.getClass(), "formatAsBlock", false);
        setBooleanField(term59779, term59779.getClass(), "canContainInline", false);
        setBooleanField(term59779, term59779.getClass(), "empty", true);
        setBooleanField(term59779, term59779.getClass(), "selfClosing", false);
        setBooleanField(term59779, term59779.getClass(), "preserveWhitespace", false);
        setBooleanField(term59779, term59779.getClass(), "formList", false);
        setBooleanField(term59779, term59779.getClass(), "formSubmit", true);
        setField(term59778, term59778.getClass(), "tag", term59779);
        setField(term59782, term59782.getClass(), "referent", null);
        setField(term59783, term59783.getClass(), "lock", term59784);
        setField(term59783, term59783.getClass(), "head", null);
        setLongField(term59783, term59783.getClass(), "queueLength", -872011222785455006L);
        setField(term59782, term59782.getClass(), "queue", term59783);
        setField(term59782, term59782.getClass(), "next", null);
        setField(term59782, term59782.getClass(), "discovered", null);
        setField(term59778, term59778.getClass(), "shadowChildrenRef", term59782);
        setField(term59778, term59778.getClass(), "childNodes", term59785);
        setIntField(term59787, term59787.getClass(), "size", -1179120542);
        setField(term59787, term59787.getClass(), "keys", term59788);
        setField(term59787, term59787.getClass(), "vals", term59789);
        setField(term59778, term59778.getClass(), "attributes", term59787);
        setField(term59778, term59778.getClass(), "baseUri", "UlajhuVLaP");
        setField(term59778, term59778.getClass(), "parentNode", null);
        setIntField(term59778, term59778.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term1250, args);
        assertTrue(recursiveEquals(term1250, term59778));
        assertTrue(recursiveEquals(retValue, null));
    }

};


