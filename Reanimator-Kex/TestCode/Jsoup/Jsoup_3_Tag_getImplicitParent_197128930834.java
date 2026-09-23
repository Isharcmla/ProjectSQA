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

public class Tag_getImplicitParent_197128930834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;
     Object term2912;
     Object term2866;

    public Tag_getImplicitParent_197128930834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term712 = new ArrayList();
        ((ArrayList) term712).add((Object)null);
        ((ArrayList) term712).add((Object)null);
        ((ArrayList) term712).add((Object)null);
        ((ArrayList) term712).add((Object)null);
        ((ArrayList) term712).add((Object)null);
        ((ArrayList) term712).add((Object)null);
        Object term704 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term704, term704.getClass(), "tagName", "");
        setBooleanField(term704, term704.getClass(), "isBlock", true);
        setBooleanField(term704, term704.getClass(), "canContainBlock", false);
        setBooleanField(term704, term704.getClass(), "canContainInline", true);
        setBooleanField(term704, term704.getClass(), "optionalClosing", false);
        setBooleanField(term704, term704.getClass(), "empty", false);
        setBooleanField(term704, term704.getClass(), "preserveWhitespace", true);
        setField(term704, term704.getClass(), "ancestors", term712);
        ArrayList term702 = new ArrayList();
        ((ArrayList) term702).add(term704);
        term683 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term683, term683.getClass(), "tagName", "bWWfajKbEX");
        setBooleanField(term683, term683.getClass(), "isBlock", false);
        setBooleanField(term683, term683.getClass(), "canContainBlock", false);
        setBooleanField(term683, term683.getClass(), "canContainInline", false);
        setBooleanField(term683, term683.getClass(), "optionalClosing", true);
        setBooleanField(term683, term683.getClass(), "empty", false);
        setBooleanField(term683, term683.getClass(), "preserveWhitespace", true);
        setField(term683, term683.getClass(), "ancestors", term702);
        ArrayList term2920 = new ArrayList();
        ((ArrayList) term2920).add((Object)null);
        ((ArrayList) term2920).add((Object)null);
        ((ArrayList) term2920).add((Object)null);
        ((ArrayList) term2920).add((Object)null);
        ((ArrayList) term2920).add((Object)null);
        ((ArrayList) term2920).add((Object)null);
        Object term2917 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2917, term2917.getClass(), "tagName", "");
        setBooleanField(term2917, term2917.getClass(), "isBlock", true);
        setBooleanField(term2917, term2917.getClass(), "canContainBlock", false);
        setBooleanField(term2917, term2917.getClass(), "canContainInline", true);
        setBooleanField(term2917, term2917.getClass(), "optionalClosing", false);
        setBooleanField(term2917, term2917.getClass(), "empty", false);
        setBooleanField(term2917, term2917.getClass(), "preserveWhitespace", true);
        setField(term2917, term2917.getClass(), "ancestors", term2920);
        ArrayList term2915 = new ArrayList();
        ((ArrayList) term2915).add(term2917);
        term2912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2912, term2912.getClass(), "tagName", "bWWfajKbEX");
        setBooleanField(term2912, term2912.getClass(), "isBlock", false);
        setBooleanField(term2912, term2912.getClass(), "canContainBlock", false);
        setBooleanField(term2912, term2912.getClass(), "canContainInline", false);
        setBooleanField(term2912, term2912.getClass(), "optionalClosing", true);
        setBooleanField(term2912, term2912.getClass(), "empty", false);
        setBooleanField(term2912, term2912.getClass(), "preserveWhitespace", true);
        setField(term2912, term2912.getClass(), "ancestors", term2915);
        ArrayList term2875 = new ArrayList();
        ((ArrayList) term2875).add((Object)null);
        ((ArrayList) term2875).add((Object)null);
        ((ArrayList) term2875).add((Object)null);
        ((ArrayList) term2875).add((Object)null);
        ((ArrayList) term2875).add((Object)null);
        ((ArrayList) term2875).add((Object)null);
        term2866 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2866, term2866.getClass(), "tagName", "");
        setBooleanField(term2866, term2866.getClass(), "isBlock", true);
        setBooleanField(term2866, term2866.getClass(), "canContainBlock", false);
        setBooleanField(term2866, term2866.getClass(), "canContainInline", true);
        setBooleanField(term2866, term2866.getClass(), "optionalClosing", false);
        setBooleanField(term2866, term2866.getClass(), "empty", false);
        setBooleanField(term2866, term2866.getClass(), "preserveWhitespace", true);
        setField(term2866, term2866.getClass(), "ancestors", term2875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplicitParent", argTypes, term683, args);
        assertTrue(recursiveEquals(term683, term2912));
        assertTrue(recursiveEquals(retValue, term2866));
    }

};


