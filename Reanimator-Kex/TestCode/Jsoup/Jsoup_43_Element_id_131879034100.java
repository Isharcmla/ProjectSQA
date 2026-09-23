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
     Object term9471;

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
        ArrayList term9475 = new ArrayList();
        ((ArrayList) term9475).add((Object)null);
        ((ArrayList) term9475).add((Object)null);
        ((ArrayList) term9475).add((Object)null);
        ((ArrayList) term9475).add((Object)null);
        ((ArrayList) term9475).add((Object)null);
        ((ArrayList) term9475).add((Object)null);
        LinkedHashMap term9478 = new LinkedHashMap();
        term9471 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9472 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9477 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9472, term9472.getClass(), "tagName", "SbAoxhfrkn");
        setBooleanField(term9472, term9472.getClass(), "isBlock", true);
        setBooleanField(term9472, term9472.getClass(), "formatAsBlock", false);
        setBooleanField(term9472, term9472.getClass(), "canContainBlock", false);
        setBooleanField(term9472, term9472.getClass(), "canContainInline", true);
        setBooleanField(term9472, term9472.getClass(), "empty", true);
        setBooleanField(term9472, term9472.getClass(), "selfClosing", true);
        setBooleanField(term9472, term9472.getClass(), "preserveWhitespace", false);
        setBooleanField(term9472, term9472.getClass(), "formList", false);
        setBooleanField(term9472, term9472.getClass(), "formSubmit", false);
        setField(term9471, term9471.getClass(), "tag", term9472);
        setField(term9471, term9471.getClass(), "parentNode", null);
        setField(term9471, term9471.getClass(), "childNodes", term9475);
        setField(term9477, term9477.getClass(), "attributes", term9478);
        setField(term9471, term9471.getClass(), "attributes", term9477);
        setField(term9471, term9471.getClass(), "baseUri", "IDCWpPLRkE");
        setIntField(term9471, term9471.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term516, args);
        assertTrue(recursiveEquals(term516, term9471));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


