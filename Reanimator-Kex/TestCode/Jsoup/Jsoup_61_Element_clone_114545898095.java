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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_clone_114545898095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8314;

    public Element_clone_114545898095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8336 = new ArrayList();
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        LinkedHashMap term8341 = new LinkedHashMap();
        term8314 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8315 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8340 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8315, term8315.getClass(), "tagName", "UxgSdhxPCH");
        setBooleanField(term8315, term8315.getClass(), "isBlock", false);
        setBooleanField(term8315, term8315.getClass(), "formatAsBlock", false);
        setBooleanField(term8315, term8315.getClass(), "canContainInline", true);
        setBooleanField(term8315, term8315.getClass(), "empty", false);
        setBooleanField(term8315, term8315.getClass(), "selfClosing", true);
        setBooleanField(term8315, term8315.getClass(), "preserveWhitespace", true);
        setBooleanField(term8315, term8315.getClass(), "formList", true);
        setBooleanField(term8315, term8315.getClass(), "formSubmit", true);
        setField(term8314, term8314.getClass(), "tag", term8315);
        setField(term8314, term8314.getClass(), "parentNode", null);
        setField(term8314, term8314.getClass(), "childNodes", term8336);
        setField(term8340, term8340.getClass(), "attributes", term8341);
        setField(term8314, term8314.getClass(), "attributes", term8340);
        setField(term8314, term8314.getClass(), "baseUri", "GLbyDfbNZI");
        setIntField(term8314, term8314.getClass(), "siblingIndex", 584893196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term8314, args);
    }

};


