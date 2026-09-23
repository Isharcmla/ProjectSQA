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

public class Element_tagName_171581085296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term8874;

    public Element_tagName_171581085296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term229 = new ArrayList();
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        LinkedHashMap term234 = new LinkedHashMap();
        term206 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term207 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term233 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term207, term207.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term207, term207.getClass(), "isBlock", false);
        setBooleanField(term207, term207.getClass(), "formatAsBlock", true);
        setBooleanField(term207, term207.getClass(), "canContainBlock", true);
        setBooleanField(term207, term207.getClass(), "canContainInline", true);
        setBooleanField(term207, term207.getClass(), "empty", true);
        setBooleanField(term207, term207.getClass(), "selfClosing", true);
        setBooleanField(term207, term207.getClass(), "preserveWhitespace", true);
        setBooleanField(term207, term207.getClass(), "formList", false);
        setBooleanField(term207, term207.getClass(), "formSubmit", true);
        setField(term206, term206.getClass(), "tag", term207);
        setField(term206, term206.getClass(), "parentNode", null);
        setField(term206, term206.getClass(), "childNodes", term229);
        setField(term233, term233.getClass(), "attributes", term234);
        setField(term206, term206.getClass(), "attributes", term233);
        setField(term206, term206.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term206, term206.getClass(), "siblingIndex", 1162663216);
        ArrayList term8878 = new ArrayList();
        ((ArrayList) term8878).add((Object)null);
        ((ArrayList) term8878).add((Object)null);
        ((ArrayList) term8878).add((Object)null);
        ((ArrayList) term8878).add((Object)null);
        LinkedHashMap term8881 = new LinkedHashMap();
        term8874 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8875 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8880 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8875, term8875.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term8875, term8875.getClass(), "isBlock", false);
        setBooleanField(term8875, term8875.getClass(), "formatAsBlock", true);
        setBooleanField(term8875, term8875.getClass(), "canContainBlock", true);
        setBooleanField(term8875, term8875.getClass(), "canContainInline", true);
        setBooleanField(term8875, term8875.getClass(), "empty", true);
        setBooleanField(term8875, term8875.getClass(), "selfClosing", true);
        setBooleanField(term8875, term8875.getClass(), "preserveWhitespace", true);
        setBooleanField(term8875, term8875.getClass(), "formList", false);
        setBooleanField(term8875, term8875.getClass(), "formSubmit", true);
        setField(term8874, term8874.getClass(), "tag", term8875);
        setField(term8874, term8874.getClass(), "parentNode", null);
        setField(term8874, term8874.getClass(), "childNodes", term8878);
        setField(term8880, term8880.getClass(), "attributes", term8881);
        setField(term8874, term8874.getClass(), "attributes", term8880);
        setField(term8874, term8874.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term8874, term8874.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term206, args);
        assertTrue(recursiveEquals(term206, term8874));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


