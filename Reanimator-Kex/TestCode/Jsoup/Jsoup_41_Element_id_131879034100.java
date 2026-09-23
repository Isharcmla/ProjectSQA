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

public class Element_id_131879034100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term9474;

    public Element_id_131879034100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term539 = new ArrayList();
        ((ArrayList) term539).add((Object)null);
        ((ArrayList) term539).add((Object)null);
        ((ArrayList) term539).add((Object)null);
        ((ArrayList) term539).add((Object)null);
        ((ArrayList) term539).add((Object)null);
        ((ArrayList) term539).add((Object)null);
        LinkedHashMap term544 = new LinkedHashMap();
        term516 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term517 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term543 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term517, term517.getClass(), "tagName", "SbAoxhfrkn");
        setBooleanField(term517, term517.getClass(), "isBlock", true);
        setBooleanField(term517, term517.getClass(), "formatAsBlock", false);
        setBooleanField(term517, term517.getClass(), "canContainBlock", false);
        setBooleanField(term517, term517.getClass(), "canContainInline", true);
        setBooleanField(term517, term517.getClass(), "empty", true);
        setBooleanField(term517, term517.getClass(), "selfClosing", true);
        setBooleanField(term517, term517.getClass(), "preserveWhitespace", false);
        setBooleanField(term517, term517.getClass(), "formList", false);
        setBooleanField(term517, term517.getClass(), "formSubmit", false);
        setField(term516, term516.getClass(), "tag", term517);
        setField(term516, term516.getClass(), "parentNode", null);
        setField(term516, term516.getClass(), "childNodes", term539);
        setField(term543, term543.getClass(), "attributes", term544);
        setField(term516, term516.getClass(), "attributes", term543);
        setField(term516, term516.getClass(), "baseUri", "IDCWpPLRkE");
        setIntField(term516, term516.getClass(), "siblingIndex", -616727354);
        ArrayList term9478 = new ArrayList();
        ((ArrayList) term9478).add((Object)null);
        ((ArrayList) term9478).add((Object)null);
        ((ArrayList) term9478).add((Object)null);
        ((ArrayList) term9478).add((Object)null);
        ((ArrayList) term9478).add((Object)null);
        ((ArrayList) term9478).add((Object)null);
        LinkedHashMap term9481 = new LinkedHashMap();
        term9474 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9475 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9480 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9475, term9475.getClass(), "tagName", "SbAoxhfrkn");
        setBooleanField(term9475, term9475.getClass(), "isBlock", true);
        setBooleanField(term9475, term9475.getClass(), "formatAsBlock", false);
        setBooleanField(term9475, term9475.getClass(), "canContainBlock", false);
        setBooleanField(term9475, term9475.getClass(), "canContainInline", true);
        setBooleanField(term9475, term9475.getClass(), "empty", true);
        setBooleanField(term9475, term9475.getClass(), "selfClosing", true);
        setBooleanField(term9475, term9475.getClass(), "preserveWhitespace", false);
        setBooleanField(term9475, term9475.getClass(), "formList", false);
        setBooleanField(term9475, term9475.getClass(), "formSubmit", false);
        setField(term9474, term9474.getClass(), "tag", term9475);
        setField(term9474, term9474.getClass(), "parentNode", null);
        setField(term9474, term9474.getClass(), "childNodes", term9478);
        setField(term9480, term9480.getClass(), "attributes", term9481);
        setField(term9474, term9474.getClass(), "attributes", term9480);
        setField(term9474, term9474.getClass(), "baseUri", "IDCWpPLRkE");
        setIntField(term9474, term9474.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term516, args);
        assertTrue(recursiveEquals(term516, term9474));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


