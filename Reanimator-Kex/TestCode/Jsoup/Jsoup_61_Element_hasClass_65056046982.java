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

public class Element_hasClass_65056046982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6682;

    public Element_hasClass_65056046982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6704 = new ArrayList();
        ((ArrayList) term6704).add((Object)null);
        ((ArrayList) term6704).add((Object)null);
        ((ArrayList) term6704).add((Object)null);
        ((ArrayList) term6704).add((Object)null);
        ((ArrayList) term6704).add((Object)null);
        ((ArrayList) term6704).add((Object)null);
        LinkedHashMap term6709 = new LinkedHashMap();
        term6682 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6683 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6708 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6683, term6683.getClass(), "tagName", "dwlZSxlXOo");
        setBooleanField(term6683, term6683.getClass(), "isBlock", true);
        setBooleanField(term6683, term6683.getClass(), "formatAsBlock", false);
        setBooleanField(term6683, term6683.getClass(), "canContainInline", true);
        setBooleanField(term6683, term6683.getClass(), "empty", true);
        setBooleanField(term6683, term6683.getClass(), "selfClosing", true);
        setBooleanField(term6683, term6683.getClass(), "preserveWhitespace", false);
        setBooleanField(term6683, term6683.getClass(), "formList", true);
        setBooleanField(term6683, term6683.getClass(), "formSubmit", false);
        setField(term6682, term6682.getClass(), "tag", term6683);
        setField(term6682, term6682.getClass(), "parentNode", null);
        setField(term6682, term6682.getClass(), "childNodes", term6704);
        setField(term6708, term6708.getClass(), "attributes", term6709);
        setField(term6682, term6682.getClass(), "attributes", term6708);
        setField(term6682, term6682.getClass(), "baseUri", "YsUtbngnRO");
        setIntField(term6682, term6682.getClass(), "siblingIndex", -601863069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JisaWUxcNb";
        callMethod(klass, "hasClass", argTypes, term6682, args);
    }

};


