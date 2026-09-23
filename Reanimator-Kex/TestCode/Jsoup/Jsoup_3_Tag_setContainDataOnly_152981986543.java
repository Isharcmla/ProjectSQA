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

public class Tag_setContainDataOnly_152981986543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;
     Object term4200;
     Object term4166;

    public Tag_setContainDataOnly_152981986543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1252 = new ArrayList();
        ((ArrayList) term1252).add((Object)null);
        ((ArrayList) term1252).add((Object)null);
        ((ArrayList) term1252).add((Object)null);
        ((ArrayList) term1252).add((Object)null);
        ((ArrayList) term1252).add((Object)null);
        ((ArrayList) term1252).add((Object)null);
        Object term1244 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1244, term1244.getClass(), "tagName", "");
        setBooleanField(term1244, term1244.getClass(), "isBlock", false);
        setBooleanField(term1244, term1244.getClass(), "canContainBlock", false);
        setBooleanField(term1244, term1244.getClass(), "canContainInline", true);
        setBooleanField(term1244, term1244.getClass(), "optionalClosing", true);
        setBooleanField(term1244, term1244.getClass(), "empty", false);
        setBooleanField(term1244, term1244.getClass(), "preserveWhitespace", true);
        setField(term1244, term1244.getClass(), "ancestors", term1252);
        ArrayList term1242 = new ArrayList();
        ((ArrayList) term1242).add(term1244);
        term1223 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1223, term1223.getClass(), "tagName", "HHmNoYxIGj");
        setBooleanField(term1223, term1223.getClass(), "isBlock", true);
        setBooleanField(term1223, term1223.getClass(), "canContainBlock", true);
        setBooleanField(term1223, term1223.getClass(), "canContainInline", true);
        setBooleanField(term1223, term1223.getClass(), "optionalClosing", true);
        setBooleanField(term1223, term1223.getClass(), "empty", false);
        setBooleanField(term1223, term1223.getClass(), "preserveWhitespace", false);
        setField(term1223, term1223.getClass(), "ancestors", term1242);
        ArrayList term4207 = new ArrayList();
        ((ArrayList) term4207).add((Object)null);
        ((ArrayList) term4207).add((Object)null);
        ((ArrayList) term4207).add((Object)null);
        ((ArrayList) term4207).add((Object)null);
        ((ArrayList) term4207).add((Object)null);
        ((ArrayList) term4207).add((Object)null);
        Object term4205 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4205, term4205.getClass(), "tagName", "");
        setBooleanField(term4205, term4205.getClass(), "isBlock", false);
        setBooleanField(term4205, term4205.getClass(), "canContainBlock", false);
        setBooleanField(term4205, term4205.getClass(), "canContainInline", true);
        setBooleanField(term4205, term4205.getClass(), "optionalClosing", true);
        setBooleanField(term4205, term4205.getClass(), "empty", false);
        setBooleanField(term4205, term4205.getClass(), "preserveWhitespace", true);
        setField(term4205, term4205.getClass(), "ancestors", term4207);
        ArrayList term4203 = new ArrayList();
        ((ArrayList) term4203).add(term4205);
        term4200 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4200, term4200.getClass(), "tagName", "HHmNoYxIGj");
        setBooleanField(term4200, term4200.getClass(), "isBlock", true);
        setBooleanField(term4200, term4200.getClass(), "canContainBlock", false);
        setBooleanField(term4200, term4200.getClass(), "canContainInline", false);
        setBooleanField(term4200, term4200.getClass(), "optionalClosing", true);
        setBooleanField(term4200, term4200.getClass(), "empty", false);
        setBooleanField(term4200, term4200.getClass(), "preserveWhitespace", true);
        setField(term4200, term4200.getClass(), "ancestors", term4203);
        ArrayList term4195 = new ArrayList();
        ((ArrayList) term4195).add((Object)null);
        ((ArrayList) term4195).add((Object)null);
        ((ArrayList) term4195).add((Object)null);
        ((ArrayList) term4195).add((Object)null);
        ((ArrayList) term4195).add((Object)null);
        ((ArrayList) term4195).add((Object)null);
        Object term4187 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4187, term4187.getClass(), "tagName", "");
        setBooleanField(term4187, term4187.getClass(), "isBlock", false);
        setBooleanField(term4187, term4187.getClass(), "canContainBlock", false);
        setBooleanField(term4187, term4187.getClass(), "canContainInline", true);
        setBooleanField(term4187, term4187.getClass(), "optionalClosing", true);
        setBooleanField(term4187, term4187.getClass(), "empty", false);
        setBooleanField(term4187, term4187.getClass(), "preserveWhitespace", true);
        setField(term4187, term4187.getClass(), "ancestors", term4195);
        ArrayList term4185 = new ArrayList();
        ((ArrayList) term4185).add(term4187);
        term4166 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4166, term4166.getClass(), "tagName", "HHmNoYxIGj");
        setBooleanField(term4166, term4166.getClass(), "isBlock", true);
        setBooleanField(term4166, term4166.getClass(), "canContainBlock", false);
        setBooleanField(term4166, term4166.getClass(), "canContainInline", false);
        setBooleanField(term4166, term4166.getClass(), "optionalClosing", true);
        setBooleanField(term4166, term4166.getClass(), "empty", false);
        setBooleanField(term4166, term4166.getClass(), "preserveWhitespace", true);
        setField(term4166, term4166.getClass(), "ancestors", term4185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "setContainDataOnly", argTypes, term1223, args);
        assertTrue(recursiveEquals(term1223, term4200));
        assertTrue(recursiveEquals(retValue, term4166));
    }

};


