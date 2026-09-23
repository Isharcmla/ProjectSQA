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

public class Element_isBlock_1610556381103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460;
     Object term9583;

    public Element_isBlock_1610556381103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term482 = new ArrayList();
        ((ArrayList) term482).add((Object)null);
        LinkedHashMap term487 = new LinkedHashMap();
        term460 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term461 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term486 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term461, term461.getClass(), "tagName", "TEParAifyi");
        setBooleanField(term461, term461.getClass(), "isBlock", false);
        setBooleanField(term461, term461.getClass(), "formatAsBlock", true);
        setBooleanField(term461, term461.getClass(), "canContainInline", false);
        setBooleanField(term461, term461.getClass(), "empty", false);
        setBooleanField(term461, term461.getClass(), "selfClosing", true);
        setBooleanField(term461, term461.getClass(), "preserveWhitespace", false);
        setBooleanField(term461, term461.getClass(), "formList", true);
        setBooleanField(term461, term461.getClass(), "formSubmit", false);
        setField(term460, term460.getClass(), "tag", term461);
        setField(term460, term460.getClass(), "parentNode", null);
        setField(term460, term460.getClass(), "childNodes", term482);
        setField(term486, term486.getClass(), "attributes", term487);
        setField(term460, term460.getClass(), "attributes", term486);
        setField(term460, term460.getClass(), "baseUri", "SbAoxhfrkn");
        setIntField(term460, term460.getClass(), "siblingIndex", -1922583790);
        ArrayList term9587 = new ArrayList();
        ((ArrayList) term9587).add((Object)null);
        LinkedHashMap term9590 = new LinkedHashMap();
        term9583 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9584 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9589 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9584, term9584.getClass(), "tagName", "TEParAifyi");
        setBooleanField(term9584, term9584.getClass(), "isBlock", false);
        setBooleanField(term9584, term9584.getClass(), "formatAsBlock", true);
        setBooleanField(term9584, term9584.getClass(), "canContainInline", false);
        setBooleanField(term9584, term9584.getClass(), "empty", false);
        setBooleanField(term9584, term9584.getClass(), "selfClosing", true);
        setBooleanField(term9584, term9584.getClass(), "preserveWhitespace", false);
        setBooleanField(term9584, term9584.getClass(), "formList", true);
        setBooleanField(term9584, term9584.getClass(), "formSubmit", false);
        setField(term9583, term9583.getClass(), "tag", term9584);
        setField(term9583, term9583.getClass(), "parentNode", null);
        setField(term9583, term9583.getClass(), "childNodes", term9587);
        setField(term9589, term9589.getClass(), "attributes", term9590);
        setField(term9583, term9583.getClass(), "attributes", term9589);
        setField(term9583, term9583.getClass(), "baseUri", "SbAoxhfrkn");
        setIntField(term9583, term9583.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term460, args);
        assertTrue(recursiveEquals(term460, term9583));
    }

};


