package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class Tag_setContainInlineOnly_74690244242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1168;
     Object term4125;
     Object term4080;

    public Tag_setContainInlineOnly_74690244242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1197 = new ArrayList();
        ((ArrayList) term1197).add((Object)null);
        ((ArrayList) term1197).add((Object)null);
        Object term1189 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1189, term1189.getClass(), "tagName", "");
        setBooleanField(term1189, term1189.getClass(), "isBlock", true);
        setBooleanField(term1189, term1189.getClass(), "canContainBlock", false);
        setBooleanField(term1189, term1189.getClass(), "canContainInline", false);
        setBooleanField(term1189, term1189.getClass(), "optionalClosing", false);
        setBooleanField(term1189, term1189.getClass(), "empty", false);
        setBooleanField(term1189, term1189.getClass(), "preserveWhitespace", false);
        setField(term1189, term1189.getClass(), "ancestors", term1197);
        ArrayList term1208 = new ArrayList();
        ((ArrayList) term1208).add((Object)null);
        ((ArrayList) term1208).add((Object)null);
        Object term1200 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1200, term1200.getClass(), "tagName", "");
        setBooleanField(term1200, term1200.getClass(), "isBlock", false);
        setBooleanField(term1200, term1200.getClass(), "canContainBlock", false);
        setBooleanField(term1200, term1200.getClass(), "canContainInline", false);
        setBooleanField(term1200, term1200.getClass(), "optionalClosing", true);
        setBooleanField(term1200, term1200.getClass(), "empty", true);
        setBooleanField(term1200, term1200.getClass(), "preserveWhitespace", false);
        setField(term1200, term1200.getClass(), "ancestors", term1208);
        ArrayList term1187 = new ArrayList();
        ((ArrayList) term1187).add(term1189);
        ((ArrayList) term1187).add(term1200);
        term1168 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1168, term1168.getClass(), "tagName", "UfQtPRyWRC");
        setBooleanField(term1168, term1168.getClass(), "isBlock", true);
        setBooleanField(term1168, term1168.getClass(), "canContainBlock", true);
        setBooleanField(term1168, term1168.getClass(), "canContainInline", true);
        setBooleanField(term1168, term1168.getClass(), "optionalClosing", false);
        setBooleanField(term1168, term1168.getClass(), "empty", false);
        setBooleanField(term1168, term1168.getClass(), "preserveWhitespace", true);
        setField(term1168, term1168.getClass(), "ancestors", term1187);
        ArrayList term4132 = new ArrayList();
        ((ArrayList) term4132).add((Object)null);
        ((ArrayList) term4132).add((Object)null);
        Object term4130 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4130, term4130.getClass(), "tagName", "");
        setBooleanField(term4130, term4130.getClass(), "isBlock", true);
        setBooleanField(term4130, term4130.getClass(), "canContainBlock", false);
        setBooleanField(term4130, term4130.getClass(), "canContainInline", false);
        setBooleanField(term4130, term4130.getClass(), "optionalClosing", false);
        setBooleanField(term4130, term4130.getClass(), "empty", false);
        setBooleanField(term4130, term4130.getClass(), "preserveWhitespace", false);
        setField(term4130, term4130.getClass(), "ancestors", term4132);
        ArrayList term4135 = new ArrayList();
        ((ArrayList) term4135).add((Object)null);
        ((ArrayList) term4135).add((Object)null);
        Object term4133 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4133, term4133.getClass(), "tagName", "");
        setBooleanField(term4133, term4133.getClass(), "isBlock", false);
        setBooleanField(term4133, term4133.getClass(), "canContainBlock", false);
        setBooleanField(term4133, term4133.getClass(), "canContainInline", false);
        setBooleanField(term4133, term4133.getClass(), "optionalClosing", true);
        setBooleanField(term4133, term4133.getClass(), "empty", true);
        setBooleanField(term4133, term4133.getClass(), "preserveWhitespace", false);
        setField(term4133, term4133.getClass(), "ancestors", term4135);
        ArrayList term4128 = new ArrayList();
        ((ArrayList) term4128).add(term4130);
        ((ArrayList) term4128).add(term4133);
        term4125 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4125, term4125.getClass(), "tagName", "UfQtPRyWRC");
        setBooleanField(term4125, term4125.getClass(), "isBlock", true);
        setBooleanField(term4125, term4125.getClass(), "canContainBlock", false);
        setBooleanField(term4125, term4125.getClass(), "canContainInline", true);
        setBooleanField(term4125, term4125.getClass(), "optionalClosing", false);
        setBooleanField(term4125, term4125.getClass(), "empty", false);
        setBooleanField(term4125, term4125.getClass(), "preserveWhitespace", true);
        setField(term4125, term4125.getClass(), "ancestors", term4128);
        ArrayList term4109 = new ArrayList();
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        Object term4101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4101, term4101.getClass(), "tagName", "");
        setBooleanField(term4101, term4101.getClass(), "isBlock", true);
        setBooleanField(term4101, term4101.getClass(), "canContainBlock", false);
        setBooleanField(term4101, term4101.getClass(), "canContainInline", false);
        setBooleanField(term4101, term4101.getClass(), "optionalClosing", false);
        setBooleanField(term4101, term4101.getClass(), "empty", false);
        setBooleanField(term4101, term4101.getClass(), "preserveWhitespace", false);
        setField(term4101, term4101.getClass(), "ancestors", term4109);
        ArrayList term4120 = new ArrayList();
        ((ArrayList) term4120).add((Object)null);
        ((ArrayList) term4120).add((Object)null);
        Object term4112 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4112, term4112.getClass(), "tagName", "");
        setBooleanField(term4112, term4112.getClass(), "isBlock", false);
        setBooleanField(term4112, term4112.getClass(), "canContainBlock", false);
        setBooleanField(term4112, term4112.getClass(), "canContainInline", false);
        setBooleanField(term4112, term4112.getClass(), "optionalClosing", true);
        setBooleanField(term4112, term4112.getClass(), "empty", true);
        setBooleanField(term4112, term4112.getClass(), "preserveWhitespace", false);
        setField(term4112, term4112.getClass(), "ancestors", term4120);
        ArrayList term4099 = new ArrayList();
        ((ArrayList) term4099).add(term4101);
        ((ArrayList) term4099).add(term4112);
        term4080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4080, term4080.getClass(), "tagName", "UfQtPRyWRC");
        setBooleanField(term4080, term4080.getClass(), "isBlock", true);
        setBooleanField(term4080, term4080.getClass(), "canContainBlock", false);
        setBooleanField(term4080, term4080.getClass(), "canContainInline", true);
        setBooleanField(term4080, term4080.getClass(), "optionalClosing", false);
        setBooleanField(term4080, term4080.getClass(), "empty", false);
        setBooleanField(term4080, term4080.getClass(), "preserveWhitespace", true);
        setField(term4080, term4080.getClass(), "ancestors", term4099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "setContainInlineOnly", argTypes, term1168, args);
        assertTrue(recursiveEquals(term1168, term4125));
        assertTrue(recursiveEquals(retValue, term4080));
    }

};


