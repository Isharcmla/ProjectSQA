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
import java.util.LinkedHashMap;

public class Element_id_131879034104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;
     Object term9701;

    public Element_id_131879034104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term553 = new ArrayList();
        ((ArrayList) term553).add((Object)null);
        ((ArrayList) term553).add((Object)null);
        ((ArrayList) term553).add((Object)null);
        ((ArrayList) term553).add((Object)null);
        ((ArrayList) term553).add((Object)null);
        ((ArrayList) term553).add((Object)null);
        LinkedHashMap term558 = new LinkedHashMap();
        term531 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term557 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term532, term532.getClass(), "tagName", "kuTXqwMtDB");
        setBooleanField(term532, term532.getClass(), "isBlock", false);
        setBooleanField(term532, term532.getClass(), "formatAsBlock", true);
        setBooleanField(term532, term532.getClass(), "canContainInline", false);
        setBooleanField(term532, term532.getClass(), "empty", false);
        setBooleanField(term532, term532.getClass(), "selfClosing", false);
        setBooleanField(term532, term532.getClass(), "preserveWhitespace", false);
        setBooleanField(term532, term532.getClass(), "formList", true);
        setBooleanField(term532, term532.getClass(), "formSubmit", true);
        setField(term531, term531.getClass(), "tag", term532);
        setField(term531, term531.getClass(), "parentNode", null);
        setField(term531, term531.getClass(), "childNodes", term553);
        setField(term557, term557.getClass(), "attributes", term558);
        setField(term531, term531.getClass(), "attributes", term557);
        setField(term531, term531.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term531, term531.getClass(), "siblingIndex", -616727354);
        ArrayList term9705 = new ArrayList();
        ((ArrayList) term9705).add((Object)null);
        ((ArrayList) term9705).add((Object)null);
        ((ArrayList) term9705).add((Object)null);
        ((ArrayList) term9705).add((Object)null);
        ((ArrayList) term9705).add((Object)null);
        ((ArrayList) term9705).add((Object)null);
        LinkedHashMap term9708 = new LinkedHashMap();
        term9701 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9702 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9707 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9702, term9702.getClass(), "tagName", "kuTXqwMtDB");
        setBooleanField(term9702, term9702.getClass(), "isBlock", false);
        setBooleanField(term9702, term9702.getClass(), "formatAsBlock", true);
        setBooleanField(term9702, term9702.getClass(), "canContainInline", false);
        setBooleanField(term9702, term9702.getClass(), "empty", false);
        setBooleanField(term9702, term9702.getClass(), "selfClosing", false);
        setBooleanField(term9702, term9702.getClass(), "preserveWhitespace", false);
        setBooleanField(term9702, term9702.getClass(), "formList", true);
        setBooleanField(term9702, term9702.getClass(), "formSubmit", true);
        setField(term9701, term9701.getClass(), "tag", term9702);
        setField(term9701, term9701.getClass(), "parentNode", null);
        setField(term9701, term9701.getClass(), "childNodes", term9705);
        setField(term9707, term9707.getClass(), "attributes", term9708);
        setField(term9701, term9701.getClass(), "attributes", term9707);
        setField(term9701, term9701.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term9701, term9701.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term531, args);
        assertTrue(recursiveEquals(term531, term9701));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


