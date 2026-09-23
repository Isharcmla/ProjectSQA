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

public class Element_dataset_1324342130107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812;
     Object term10215;
     Object term10168;

    public Element_dataset_1324342130107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term834 = new ArrayList();
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        LinkedHashMap term839 = new LinkedHashMap();
        term812 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term813 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term838 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term813, term813.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term813, term813.getClass(), "isBlock", false);
        setBooleanField(term813, term813.getClass(), "formatAsBlock", true);
        setBooleanField(term813, term813.getClass(), "canContainInline", false);
        setBooleanField(term813, term813.getClass(), "empty", true);
        setBooleanField(term813, term813.getClass(), "selfClosing", false);
        setBooleanField(term813, term813.getClass(), "preserveWhitespace", true);
        setBooleanField(term813, term813.getClass(), "formList", false);
        setBooleanField(term813, term813.getClass(), "formSubmit", false);
        setField(term812, term812.getClass(), "tag", term813);
        setField(term812, term812.getClass(), "parentNode", null);
        setField(term812, term812.getClass(), "childNodes", term834);
        setField(term838, term838.getClass(), "attributes", term839);
        setField(term812, term812.getClass(), "attributes", term838);
        setField(term812, term812.getClass(), "baseUri", "ffYhPOzlUs");
        setIntField(term812, term812.getClass(), "siblingIndex", 1227103734);
        ArrayList term10219 = new ArrayList();
        ((ArrayList) term10219).add((Object)null);
        ((ArrayList) term10219).add((Object)null);
        ((ArrayList) term10219).add((Object)null);
        ((ArrayList) term10219).add((Object)null);
        ((ArrayList) term10219).add((Object)null);
        ((ArrayList) term10219).add((Object)null);
        ((ArrayList) term10219).add((Object)null);
        LinkedHashMap term10222 = new LinkedHashMap();
        term10215 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10216 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10221 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10216, term10216.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term10216, term10216.getClass(), "isBlock", false);
        setBooleanField(term10216, term10216.getClass(), "formatAsBlock", true);
        setBooleanField(term10216, term10216.getClass(), "canContainInline", false);
        setBooleanField(term10216, term10216.getClass(), "empty", true);
        setBooleanField(term10216, term10216.getClass(), "selfClosing", false);
        setBooleanField(term10216, term10216.getClass(), "preserveWhitespace", true);
        setBooleanField(term10216, term10216.getClass(), "formList", false);
        setBooleanField(term10216, term10216.getClass(), "formSubmit", false);
        setField(term10215, term10215.getClass(), "tag", term10216);
        setField(term10215, term10215.getClass(), "parentNode", null);
        setField(term10215, term10215.getClass(), "childNodes", term10219);
        setField(term10221, term10221.getClass(), "attributes", term10222);
        setField(term10215, term10215.getClass(), "attributes", term10221);
        setField(term10215, term10215.getClass(), "baseUri", "ffYhPOzlUs");
        setIntField(term10215, term10215.getClass(), "siblingIndex", 1227103734);
        LinkedHashMap term10170 = new LinkedHashMap();
        term10168 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term10169 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10169, term10169.getClass(), "attributes", term10170);
        setField(term10168, term10168.getClass(), "this$0", term10169);
        setField(term10168, term10168.getClass(), "keySet", null);
        setField(term10168, term10168.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term812, args);
        assertTrue(recursiveEquals(term812, term10215));
        assertTrue(recursiveEquals(retValue, term10168));
    }

};


