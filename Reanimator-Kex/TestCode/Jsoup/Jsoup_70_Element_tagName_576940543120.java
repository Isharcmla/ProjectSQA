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

public class Element_tagName_576940543120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term57317;
     Object term57270;

    public Element_tagName_576940543120() {
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
        ArrayList term57324 = new ArrayList();
        ((ArrayList) term57324).add((Object)null);
        ((ArrayList) term57324).add((Object)null);
        ((ArrayList) term57324).add((Object)null);
        ((ArrayList) term57324).add((Object)null);
        ((ArrayList) term57324).add((Object)null);
        ((ArrayList) term57324).add((Object)null);
        ((ArrayList) term57324).add((Object)null);
        term57317 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57318 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57321 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57322 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57323 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57326 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57327 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57328 = (Object[]) newArray("java.lang.String", 0);
        setField(term57318, term57318.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term57318, term57318.getClass(), "isBlock", false);
        setBooleanField(term57318, term57318.getClass(), "formatAsBlock", true);
        setBooleanField(term57318, term57318.getClass(), "canContainInline", true);
        setBooleanField(term57318, term57318.getClass(), "empty", false);
        setBooleanField(term57318, term57318.getClass(), "selfClosing", false);
        setBooleanField(term57318, term57318.getClass(), "preserveWhitespace", false);
        setBooleanField(term57318, term57318.getClass(), "formList", false);
        setBooleanField(term57318, term57318.getClass(), "formSubmit", false);
        setField(term57317, term57317.getClass(), "tag", term57318);
        setField(term57321, term57321.getClass(), "referent", null);
        setField(term57322, term57322.getClass(), "lock", term57323);
        setField(term57322, term57322.getClass(), "head", null);
        setLongField(term57322, term57322.getClass(), "queueLength", -7237588299778557629L);
        setField(term57321, term57321.getClass(), "queue", term57322);
        setField(term57321, term57321.getClass(), "next", null);
        setField(term57321, term57321.getClass(), "discovered", null);
        setField(term57317, term57317.getClass(), "shadowChildrenRef", term57321);
        setField(term57317, term57317.getClass(), "childNodes", term57324);
        setIntField(term57326, term57326.getClass(), "size", -1456670397);
        setField(term57326, term57326.getClass(), "keys", term57327);
        setField(term57326, term57326.getClass(), "vals", term57328);
        setField(term57317, term57317.getClass(), "attributes", term57326);
        setField(term57317, term57317.getClass(), "baseUri", "eZFUvlxvGV");
        setField(term57317, term57317.getClass(), "parentNode", null);
        setIntField(term57317, term57317.getClass(), "siblingIndex", 1622346318);
        ArrayList term57296 = new ArrayList();
        ((ArrayList) term57296).add((Object)null);
        ((ArrayList) term57296).add((Object)null);
        ((ArrayList) term57296).add((Object)null);
        ((ArrayList) term57296).add((Object)null);
        ((ArrayList) term57296).add((Object)null);
        ((ArrayList) term57296).add((Object)null);
        ((ArrayList) term57296).add((Object)null);
        term57270 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57271 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57292 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57293 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57294 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57302 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57303 = (Object[]) newArray("java.lang.String", 0);
        setField(term57271, term57271.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term57271, term57271.getClass(), "isBlock", false);
        setBooleanField(term57271, term57271.getClass(), "formatAsBlock", true);
        setBooleanField(term57271, term57271.getClass(), "canContainInline", true);
        setBooleanField(term57271, term57271.getClass(), "empty", false);
        setBooleanField(term57271, term57271.getClass(), "selfClosing", false);
        setBooleanField(term57271, term57271.getClass(), "preserveWhitespace", false);
        setBooleanField(term57271, term57271.getClass(), "formList", false);
        setBooleanField(term57271, term57271.getClass(), "formSubmit", false);
        setField(term57270, term57270.getClass(), "tag", term57271);
        setField(term57292, term57292.getClass(), "referent", null);
        setField(term57293, term57293.getClass(), "lock", term57294);
        setField(term57293, term57293.getClass(), "head", null);
        setLongField(term57293, term57293.getClass(), "queueLength", -7237588299778557629L);
        setField(term57292, term57292.getClass(), "queue", term57293);
        setField(term57292, term57292.getClass(), "next", null);
        setField(term57292, term57292.getClass(), "discovered", null);
        setField(term57270, term57270.getClass(), "shadowChildrenRef", term57292);
        setField(term57270, term57270.getClass(), "childNodes", term57296);
        setIntField(term57300, term57300.getClass(), "size", -1456670397);
        setField(term57300, term57300.getClass(), "keys", term57302);
        setField(term57300, term57300.getClass(), "vals", term57303);
        setField(term57270, term57270.getClass(), "attributes", term57300);
        setField(term57270, term57270.getClass(), "baseUri", "eZFUvlxvGV");
        setField(term57270, term57270.getClass(), "parentNode", null);
        setIntField(term57270, term57270.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        Object retValue = callMethod(klass, "tagName", argTypes, term691, args);
        assertTrue(recursiveEquals(term691, term57317));
        assertTrue(recursiveEquals(retValue, term57270));
    }

};


