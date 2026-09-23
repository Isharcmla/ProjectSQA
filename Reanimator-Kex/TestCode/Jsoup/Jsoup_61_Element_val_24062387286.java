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

public class Element_val_24062387286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7054;

    public Element_val_24062387286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7076 = new ArrayList();
        ((ArrayList) term7076).add((Object)null);
        LinkedHashMap term7081 = new LinkedHashMap();
        term7054 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7055 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7080 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7055, term7055.getClass(), "tagName", "gPzGDOEPPw");
        setBooleanField(term7055, term7055.getClass(), "isBlock", false);
        setBooleanField(term7055, term7055.getClass(), "formatAsBlock", false);
        setBooleanField(term7055, term7055.getClass(), "canContainInline", false);
        setBooleanField(term7055, term7055.getClass(), "empty", true);
        setBooleanField(term7055, term7055.getClass(), "selfClosing", false);
        setBooleanField(term7055, term7055.getClass(), "preserveWhitespace", true);
        setBooleanField(term7055, term7055.getClass(), "formList", true);
        setBooleanField(term7055, term7055.getClass(), "formSubmit", true);
        setField(term7054, term7054.getClass(), "tag", term7055);
        setField(term7054, term7054.getClass(), "parentNode", null);
        setField(term7054, term7054.getClass(), "childNodes", term7076);
        setField(term7080, term7080.getClass(), "attributes", term7081);
        setField(term7054, term7054.getClass(), "attributes", term7080);
        setField(term7054, term7054.getClass(), "baseUri", "McpzErOcYb");
        setIntField(term7054, term7054.getClass(), "siblingIndex", -1731761810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "val", argTypes, term7054, args);
    }

};


