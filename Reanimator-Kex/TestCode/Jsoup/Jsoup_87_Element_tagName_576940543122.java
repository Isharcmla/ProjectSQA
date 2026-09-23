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

public class Element_tagName_576940543122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term57908;

    public Element_tagName_576940543122() {
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
        setBooleanField(term692, term692.getClass(), "isBlock", true);
        setBooleanField(term692, term692.getClass(), "formatAsBlock", false);
        setBooleanField(term692, term692.getClass(), "canContainInline", true);
        setBooleanField(term692, term692.getClass(), "empty", false);
        setBooleanField(term692, term692.getClass(), "selfClosing", true);
        setBooleanField(term692, term692.getClass(), "preserveWhitespace", false);
        setBooleanField(term692, term692.getClass(), "formList", false);
        setBooleanField(term692, term692.getClass(), "formSubmit", true);
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
        ArrayList term57915 = new ArrayList();
        ((ArrayList) term57915).add((Object)null);
        ((ArrayList) term57915).add((Object)null);
        ((ArrayList) term57915).add((Object)null);
        ((ArrayList) term57915).add((Object)null);
        ((ArrayList) term57915).add((Object)null);
        ((ArrayList) term57915).add((Object)null);
        ((ArrayList) term57915).add((Object)null);
        term57908 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57912 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57913 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57914 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57917 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57918 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57919 = (Object[]) newArray("java.lang.String", 0);
        setField(term57909, term57909.getClass(), "tagName", "byqfiqckav");
        setBooleanField(term57909, term57909.getClass(), "isBlock", false);
        setBooleanField(term57909, term57909.getClass(), "formatAsBlock", true);
        setBooleanField(term57909, term57909.getClass(), "canContainInline", true);
        setBooleanField(term57909, term57909.getClass(), "empty", false);
        setBooleanField(term57909, term57909.getClass(), "selfClosing", false);
        setBooleanField(term57909, term57909.getClass(), "preserveWhitespace", false);
        setBooleanField(term57909, term57909.getClass(), "formList", false);
        setBooleanField(term57909, term57909.getClass(), "formSubmit", false);
        setField(term57908, term57908.getClass(), "tag", term57909);
        setField(term57912, term57912.getClass(), "referent", null);
        setField(term57913, term57913.getClass(), "lock", term57914);
        setField(term57913, term57913.getClass(), "head", null);
        setLongField(term57913, term57913.getClass(), "queueLength", -7237588299778557629L);
        setField(term57912, term57912.getClass(), "queue", term57913);
        setField(term57912, term57912.getClass(), "next", null);
        setField(term57912, term57912.getClass(), "discovered", null);
        setField(term57908, term57908.getClass(), "shadowChildrenRef", term57912);
        setField(term57908, term57908.getClass(), "childNodes", term57915);
        setIntField(term57917, term57917.getClass(), "size", -1456670397);
        setField(term57917, term57917.getClass(), "keys", term57918);
        setField(term57917, term57917.getClass(), "vals", term57919);
        setField(term57908, term57908.getClass(), "attributes", term57917);
        setField(term57908, term57908.getClass(), "baseUri", "eZFUvlxvGV");
        setField(term57908, term57908.getClass(), "parentNode", null);
        setIntField(term57908, term57908.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "tagName", argTypes, term691, args);
        assertTrue(recursiveEquals(term691, term57908));
    }

};


