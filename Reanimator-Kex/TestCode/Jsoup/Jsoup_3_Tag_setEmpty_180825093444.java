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

public class Tag_setEmpty_180825093444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267;
     Object term4274;
     Object term4218;

    public Tag_setEmpty_180825093444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1296 = new ArrayList();
        ((ArrayList) term1296).add((Object)null);
        ((ArrayList) term1296).add((Object)null);
        ((ArrayList) term1296).add((Object)null);
        ((ArrayList) term1296).add((Object)null);
        Object term1288 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1288, term1288.getClass(), "tagName", "");
        setBooleanField(term1288, term1288.getClass(), "isBlock", true);
        setBooleanField(term1288, term1288.getClass(), "canContainBlock", false);
        setBooleanField(term1288, term1288.getClass(), "canContainInline", false);
        setBooleanField(term1288, term1288.getClass(), "optionalClosing", false);
        setBooleanField(term1288, term1288.getClass(), "empty", true);
        setBooleanField(term1288, term1288.getClass(), "preserveWhitespace", false);
        setField(term1288, term1288.getClass(), "ancestors", term1296);
        ArrayList term1307 = new ArrayList();
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        Object term1299 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1299, term1299.getClass(), "tagName", "");
        setBooleanField(term1299, term1299.getClass(), "isBlock", false);
        setBooleanField(term1299, term1299.getClass(), "canContainBlock", true);
        setBooleanField(term1299, term1299.getClass(), "canContainInline", false);
        setBooleanField(term1299, term1299.getClass(), "optionalClosing", true);
        setBooleanField(term1299, term1299.getClass(), "empty", true);
        setBooleanField(term1299, term1299.getClass(), "preserveWhitespace", false);
        setField(term1299, term1299.getClass(), "ancestors", term1307);
        ArrayList term1318 = new ArrayList();
        ((ArrayList) term1318).add((Object)null);
        Object term1310 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1310, term1310.getClass(), "tagName", "");
        setBooleanField(term1310, term1310.getClass(), "isBlock", false);
        setBooleanField(term1310, term1310.getClass(), "canContainBlock", true);
        setBooleanField(term1310, term1310.getClass(), "canContainInline", true);
        setBooleanField(term1310, term1310.getClass(), "optionalClosing", false);
        setBooleanField(term1310, term1310.getClass(), "empty", true);
        setBooleanField(term1310, term1310.getClass(), "preserveWhitespace", true);
        setField(term1310, term1310.getClass(), "ancestors", term1318);
        ArrayList term1286 = new ArrayList();
        ((ArrayList) term1286).add(term1288);
        ((ArrayList) term1286).add(term1299);
        ((ArrayList) term1286).add(term1310);
        term1267 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1267, term1267.getClass(), "tagName", "smnHEqRFRx");
        setBooleanField(term1267, term1267.getClass(), "isBlock", true);
        setBooleanField(term1267, term1267.getClass(), "canContainBlock", false);
        setBooleanField(term1267, term1267.getClass(), "canContainInline", true);
        setBooleanField(term1267, term1267.getClass(), "optionalClosing", false);
        setBooleanField(term1267, term1267.getClass(), "empty", true);
        setBooleanField(term1267, term1267.getClass(), "preserveWhitespace", true);
        setField(term1267, term1267.getClass(), "ancestors", term1286);
        ArrayList term4281 = new ArrayList();
        ((ArrayList) term4281).add((Object)null);
        ((ArrayList) term4281).add((Object)null);
        ((ArrayList) term4281).add((Object)null);
        ((ArrayList) term4281).add((Object)null);
        Object term4279 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4279, term4279.getClass(), "tagName", "");
        setBooleanField(term4279, term4279.getClass(), "isBlock", true);
        setBooleanField(term4279, term4279.getClass(), "canContainBlock", false);
        setBooleanField(term4279, term4279.getClass(), "canContainInline", false);
        setBooleanField(term4279, term4279.getClass(), "optionalClosing", false);
        setBooleanField(term4279, term4279.getClass(), "empty", true);
        setBooleanField(term4279, term4279.getClass(), "preserveWhitespace", false);
        setField(term4279, term4279.getClass(), "ancestors", term4281);
        ArrayList term4284 = new ArrayList();
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        Object term4282 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4282, term4282.getClass(), "tagName", "");
        setBooleanField(term4282, term4282.getClass(), "isBlock", false);
        setBooleanField(term4282, term4282.getClass(), "canContainBlock", true);
        setBooleanField(term4282, term4282.getClass(), "canContainInline", false);
        setBooleanField(term4282, term4282.getClass(), "optionalClosing", true);
        setBooleanField(term4282, term4282.getClass(), "empty", true);
        setBooleanField(term4282, term4282.getClass(), "preserveWhitespace", false);
        setField(term4282, term4282.getClass(), "ancestors", term4284);
        ArrayList term4287 = new ArrayList();
        ((ArrayList) term4287).add((Object)null);
        Object term4285 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4285, term4285.getClass(), "tagName", "");
        setBooleanField(term4285, term4285.getClass(), "isBlock", false);
        setBooleanField(term4285, term4285.getClass(), "canContainBlock", true);
        setBooleanField(term4285, term4285.getClass(), "canContainInline", true);
        setBooleanField(term4285, term4285.getClass(), "optionalClosing", false);
        setBooleanField(term4285, term4285.getClass(), "empty", true);
        setBooleanField(term4285, term4285.getClass(), "preserveWhitespace", true);
        setField(term4285, term4285.getClass(), "ancestors", term4287);
        ArrayList term4277 = new ArrayList();
        ((ArrayList) term4277).add(term4279);
        ((ArrayList) term4277).add(term4282);
        ((ArrayList) term4277).add(term4285);
        term4274 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4274, term4274.getClass(), "tagName", "smnHEqRFRx");
        setBooleanField(term4274, term4274.getClass(), "isBlock", true);
        setBooleanField(term4274, term4274.getClass(), "canContainBlock", false);
        setBooleanField(term4274, term4274.getClass(), "canContainInline", false);
        setBooleanField(term4274, term4274.getClass(), "optionalClosing", false);
        setBooleanField(term4274, term4274.getClass(), "empty", true);
        setBooleanField(term4274, term4274.getClass(), "preserveWhitespace", true);
        setField(term4274, term4274.getClass(), "ancestors", term4277);
        ArrayList term4247 = new ArrayList();
        ((ArrayList) term4247).add((Object)null);
        ((ArrayList) term4247).add((Object)null);
        ((ArrayList) term4247).add((Object)null);
        ((ArrayList) term4247).add((Object)null);
        Object term4239 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4239, term4239.getClass(), "tagName", "");
        setBooleanField(term4239, term4239.getClass(), "isBlock", true);
        setBooleanField(term4239, term4239.getClass(), "canContainBlock", false);
        setBooleanField(term4239, term4239.getClass(), "canContainInline", false);
        setBooleanField(term4239, term4239.getClass(), "optionalClosing", false);
        setBooleanField(term4239, term4239.getClass(), "empty", true);
        setBooleanField(term4239, term4239.getClass(), "preserveWhitespace", false);
        setField(term4239, term4239.getClass(), "ancestors", term4247);
        ArrayList term4258 = new ArrayList();
        ((ArrayList) term4258).add((Object)null);
        ((ArrayList) term4258).add((Object)null);
        ((ArrayList) term4258).add((Object)null);
        ((ArrayList) term4258).add((Object)null);
        Object term4250 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4250, term4250.getClass(), "tagName", "");
        setBooleanField(term4250, term4250.getClass(), "isBlock", false);
        setBooleanField(term4250, term4250.getClass(), "canContainBlock", true);
        setBooleanField(term4250, term4250.getClass(), "canContainInline", false);
        setBooleanField(term4250, term4250.getClass(), "optionalClosing", true);
        setBooleanField(term4250, term4250.getClass(), "empty", true);
        setBooleanField(term4250, term4250.getClass(), "preserveWhitespace", false);
        setField(term4250, term4250.getClass(), "ancestors", term4258);
        ArrayList term4269 = new ArrayList();
        ((ArrayList) term4269).add((Object)null);
        Object term4261 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4261, term4261.getClass(), "tagName", "");
        setBooleanField(term4261, term4261.getClass(), "isBlock", false);
        setBooleanField(term4261, term4261.getClass(), "canContainBlock", true);
        setBooleanField(term4261, term4261.getClass(), "canContainInline", true);
        setBooleanField(term4261, term4261.getClass(), "optionalClosing", false);
        setBooleanField(term4261, term4261.getClass(), "empty", true);
        setBooleanField(term4261, term4261.getClass(), "preserveWhitespace", true);
        setField(term4261, term4261.getClass(), "ancestors", term4269);
        ArrayList term4237 = new ArrayList();
        ((ArrayList) term4237).add(term4239);
        ((ArrayList) term4237).add(term4250);
        ((ArrayList) term4237).add(term4261);
        term4218 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4218, term4218.getClass(), "tagName", "smnHEqRFRx");
        setBooleanField(term4218, term4218.getClass(), "isBlock", true);
        setBooleanField(term4218, term4218.getClass(), "canContainBlock", false);
        setBooleanField(term4218, term4218.getClass(), "canContainInline", false);
        setBooleanField(term4218, term4218.getClass(), "optionalClosing", false);
        setBooleanField(term4218, term4218.getClass(), "empty", true);
        setBooleanField(term4218, term4218.getClass(), "preserveWhitespace", true);
        setField(term4218, term4218.getClass(), "ancestors", term4237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "setEmpty", argTypes, term1267, args);
        assertTrue(recursiveEquals(term1267, term4274));
        assertTrue(recursiveEquals(retValue, term4218));
    }

};


