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

public class Element_tagName_576940543119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term10893;
     Object term10846;

    public Element_tagName_576940543119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term717 = new ArrayList();
        ((ArrayList) term717).add((Object)null);
        ((ArrayList) term717).add((Object)null);
        ((ArrayList) term717).add((Object)null);
        ((ArrayList) term717).add((Object)null);
        ((ArrayList) term717).add((Object)null);
        ((ArrayList) term717).add((Object)null);
        ((ArrayList) term717).add((Object)null);
        term691 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term692 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term713 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term714 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term715 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term721 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term723 = (Object[]) newArray("java.lang.String", 0);
        Object[] term724 = (Object[]) newArray("java.lang.String", 0);
        setField(term692, term692.getClass(), "tagName", "xOEqzGAmDU");
        setBooleanField(term692, term692.getClass(), "isBlock", false);
        setBooleanField(term692, term692.getClass(), "formatAsBlock", true);
        setBooleanField(term692, term692.getClass(), "canContainInline", false);
        setBooleanField(term692, term692.getClass(), "empty", true);
        setBooleanField(term692, term692.getClass(), "selfClosing", false);
        setBooleanField(term692, term692.getClass(), "preserveWhitespace", true);
        setBooleanField(term692, term692.getClass(), "formList", false);
        setBooleanField(term692, term692.getClass(), "formSubmit", false);
        setField(term691, term691.getClass(), "tag", term692);
        setField(term713, term713.getClass(), "referent", null);
        setField(term714, term714.getClass(), "lock", term715);
        setField(term714, term714.getClass(), "head", null);
        setLongField(term714, term714.getClass(), "queueLength", -7237588299778557629L);
        setField(term713, term713.getClass(), "queue", term714);
        setField(term713, term713.getClass(), "next", null);
        setField(term713, term713.getClass(), "discovered", null);
        setField(term691, term691.getClass(), "shadowChildrenRef", term713);
        setField(term691, term691.getClass(), "childNodes", term717);
        setIntField(term721, term721.getClass(), "size", -1456670397);
        setField(term721, term721.getClass(), "keys", term723);
        setField(term721, term721.getClass(), "vals", term724);
        setField(term691, term691.getClass(), "attributes", term721);
        setField(term691, term691.getClass(), "baseUri", "eZFUvlxvGV");
        setField(term691, term691.getClass(), "parentNode", null);
        setIntField(term691, term691.getClass(), "siblingIndex", 1622346318);
        ArrayList term10900 = new ArrayList();
        ((ArrayList) term10900).add((Object)null);
        ((ArrayList) term10900).add((Object)null);
        ((ArrayList) term10900).add((Object)null);
        ((ArrayList) term10900).add((Object)null);
        ((ArrayList) term10900).add((Object)null);
        ((ArrayList) term10900).add((Object)null);
        ((ArrayList) term10900).add((Object)null);
        term10893 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10894 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10897 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10898 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10899 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10902 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10903 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10904 = (Object[]) newArray("java.lang.String", 0);
        setField(term10894, term10894.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term10894, term10894.getClass(), "isBlock", false);
        setBooleanField(term10894, term10894.getClass(), "formatAsBlock", true);
        setBooleanField(term10894, term10894.getClass(), "canContainInline", true);
        setBooleanField(term10894, term10894.getClass(), "empty", false);
        setBooleanField(term10894, term10894.getClass(), "selfClosing", false);
        setBooleanField(term10894, term10894.getClass(), "preserveWhitespace", false);
        setBooleanField(term10894, term10894.getClass(), "formList", false);
        setBooleanField(term10894, term10894.getClass(), "formSubmit", false);
        setField(term10893, term10893.getClass(), "tag", term10894);
        setField(term10897, term10897.getClass(), "referent", null);
        setField(term10898, term10898.getClass(), "lock", term10899);
        setField(term10898, term10898.getClass(), "head", null);
        setLongField(term10898, term10898.getClass(), "queueLength", -7237588299778557629L);
        setField(term10897, term10897.getClass(), "queue", term10898);
        setField(term10897, term10897.getClass(), "next", null);
        setField(term10897, term10897.getClass(), "discovered", null);
        setField(term10893, term10893.getClass(), "shadowChildrenRef", term10897);
        setField(term10893, term10893.getClass(), "childNodes", term10900);
        setIntField(term10902, term10902.getClass(), "size", -1456670397);
        setField(term10902, term10902.getClass(), "keys", term10903);
        setField(term10902, term10902.getClass(), "vals", term10904);
        setField(term10893, term10893.getClass(), "attributes", term10902);
        setField(term10893, term10893.getClass(), "baseUri", "eZFUvlxvGV");
        setField(term10893, term10893.getClass(), "parentNode", null);
        setIntField(term10893, term10893.getClass(), "siblingIndex", 1622346318);
        ArrayList term10872 = new ArrayList();
        ((ArrayList) term10872).add((Object)null);
        ((ArrayList) term10872).add((Object)null);
        ((ArrayList) term10872).add((Object)null);
        ((ArrayList) term10872).add((Object)null);
        ((ArrayList) term10872).add((Object)null);
        ((ArrayList) term10872).add((Object)null);
        ((ArrayList) term10872).add((Object)null);
        term10846 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10847 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10868 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10869 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10870 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10876 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10878 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10879 = (Object[]) newArray("java.lang.String", 0);
        setField(term10847, term10847.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term10847, term10847.getClass(), "isBlock", false);
        setBooleanField(term10847, term10847.getClass(), "formatAsBlock", true);
        setBooleanField(term10847, term10847.getClass(), "canContainInline", true);
        setBooleanField(term10847, term10847.getClass(), "empty", false);
        setBooleanField(term10847, term10847.getClass(), "selfClosing", false);
        setBooleanField(term10847, term10847.getClass(), "preserveWhitespace", false);
        setBooleanField(term10847, term10847.getClass(), "formList", false);
        setBooleanField(term10847, term10847.getClass(), "formSubmit", false);
        setField(term10846, term10846.getClass(), "tag", term10847);
        setField(term10868, term10868.getClass(), "referent", null);
        setField(term10869, term10869.getClass(), "lock", term10870);
        setField(term10869, term10869.getClass(), "head", null);
        setLongField(term10869, term10869.getClass(), "queueLength", -7237588299778557629L);
        setField(term10868, term10868.getClass(), "queue", term10869);
        setField(term10868, term10868.getClass(), "next", null);
        setField(term10868, term10868.getClass(), "discovered", null);
        setField(term10846, term10846.getClass(), "shadowChildrenRef", term10868);
        setField(term10846, term10846.getClass(), "childNodes", term10872);
        setIntField(term10876, term10876.getClass(), "size", -1456670397);
        setField(term10876, term10876.getClass(), "keys", term10878);
        setField(term10876, term10876.getClass(), "vals", term10879);
        setField(term10846, term10846.getClass(), "attributes", term10876);
        setField(term10846, term10846.getClass(), "baseUri", "eZFUvlxvGV");
        setField(term10846, term10846.getClass(), "parentNode", null);
        setIntField(term10846, term10846.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        Object retValue = callMethod(klass, "tagName", argTypes, term691, args);
        assertTrue(recursiveEquals(term691, term10893));
        assertTrue(recursiveEquals(retValue, term10846));
    }

};


