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

public class Element_val_205212752387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7125;

    public Element_val_205212752387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7147 = new ArrayList();
        ((ArrayList) term7147).add((Object)null);
        ((ArrayList) term7147).add((Object)null);
        ((ArrayList) term7147).add((Object)null);
        ((ArrayList) term7147).add((Object)null);
        ((ArrayList) term7147).add((Object)null);
        LinkedHashMap term7152 = new LinkedHashMap();
        term7125 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7126 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7151 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7126, term7126.getClass(), "tagName", "jqrVEUvYEz");
        setBooleanField(term7126, term7126.getClass(), "isBlock", true);
        setBooleanField(term7126, term7126.getClass(), "formatAsBlock", false);
        setBooleanField(term7126, term7126.getClass(), "canContainInline", false);
        setBooleanField(term7126, term7126.getClass(), "empty", false);
        setBooleanField(term7126, term7126.getClass(), "selfClosing", false);
        setBooleanField(term7126, term7126.getClass(), "preserveWhitespace", false);
        setBooleanField(term7126, term7126.getClass(), "formList", true);
        setBooleanField(term7126, term7126.getClass(), "formSubmit", true);
        setField(term7125, term7125.getClass(), "tag", term7126);
        setField(term7125, term7125.getClass(), "parentNode", null);
        setField(term7125, term7125.getClass(), "childNodes", term7147);
        setField(term7151, term7151.getClass(), "attributes", term7152);
        setField(term7125, term7125.getClass(), "attributes", term7151);
        setField(term7125, term7125.getClass(), "baseUri", "JeZbrwZmsP");
        setIntField(term7125, term7125.getClass(), "siblingIndex", 197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bxyfeicqrK";
        callMethod(klass, "val", argTypes, term7125, args);
    }

};


