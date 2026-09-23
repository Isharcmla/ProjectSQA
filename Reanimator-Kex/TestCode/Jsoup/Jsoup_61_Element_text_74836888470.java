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

public class Element_text_74836888470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5773;

    public Element_text_74836888470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5795 = new ArrayList();
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        ((ArrayList) term5795).add((Object)null);
        LinkedHashMap term5800 = new LinkedHashMap();
        term5773 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5774 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5799 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5774, term5774.getClass(), "tagName", "lBOokzEPfe");
        setBooleanField(term5774, term5774.getClass(), "isBlock", false);
        setBooleanField(term5774, term5774.getClass(), "formatAsBlock", true);
        setBooleanField(term5774, term5774.getClass(), "canContainInline", true);
        setBooleanField(term5774, term5774.getClass(), "empty", false);
        setBooleanField(term5774, term5774.getClass(), "selfClosing", true);
        setBooleanField(term5774, term5774.getClass(), "preserveWhitespace", false);
        setBooleanField(term5774, term5774.getClass(), "formList", true);
        setBooleanField(term5774, term5774.getClass(), "formSubmit", true);
        setField(term5773, term5773.getClass(), "tag", term5774);
        setField(term5773, term5773.getClass(), "parentNode", null);
        setField(term5773, term5773.getClass(), "childNodes", term5795);
        setField(term5799, term5799.getClass(), "attributes", term5800);
        setField(term5773, term5773.getClass(), "attributes", term5799);
        setField(term5773, term5773.getClass(), "baseUri", "IEYhJmgCVd");
        setIntField(term5773, term5773.getClass(), "siblingIndex", 1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term5773, args);
    }

};


