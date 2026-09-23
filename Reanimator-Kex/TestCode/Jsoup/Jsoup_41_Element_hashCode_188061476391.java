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

public class Element_hashCode_188061476391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8214;

    public Element_hashCode_188061476391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8237 = new ArrayList();
        ((ArrayList) term8237).add((Object)null);
        ((ArrayList) term8237).add((Object)null);
        ((ArrayList) term8237).add((Object)null);
        LinkedHashMap term8242 = new LinkedHashMap();
        term8214 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8215 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8241 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8215, term8215.getClass(), "tagName", "kVAmKknVln");
        setBooleanField(term8215, term8215.getClass(), "isBlock", false);
        setBooleanField(term8215, term8215.getClass(), "formatAsBlock", false);
        setBooleanField(term8215, term8215.getClass(), "canContainBlock", false);
        setBooleanField(term8215, term8215.getClass(), "canContainInline", false);
        setBooleanField(term8215, term8215.getClass(), "empty", false);
        setBooleanField(term8215, term8215.getClass(), "selfClosing", false);
        setBooleanField(term8215, term8215.getClass(), "preserveWhitespace", true);
        setBooleanField(term8215, term8215.getClass(), "formList", false);
        setBooleanField(term8215, term8215.getClass(), "formSubmit", true);
        setField(term8214, term8214.getClass(), "tag", term8215);
        setField(term8214, term8214.getClass(), "parentNode", null);
        setField(term8214, term8214.getClass(), "childNodes", term8237);
        setField(term8241, term8241.getClass(), "attributes", term8242);
        setField(term8214, term8214.getClass(), "attributes", term8241);
        setField(term8214, term8214.getClass(), "baseUri", "MqICFYzDJj");
        setIntField(term8214, term8214.getClass(), "siblingIndex", 197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8214, args);
    }

};


