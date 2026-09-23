package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WordUtils_swapCase_117909257554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public WordUtils_swapCase_117909257554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KKKKlKKp    \u001B     \u001C< \u001C\t  \u001C ||`\u001B \t \t\u001C\n{\uFF80\\\u001C\t\\ [[\u001B\n\u001C\n \uFF80 \uFF80 \\{  \t\t\u001B 8` [\t`\u001C  \u001B\u001B\t   \t\u001C \uFF80\n\n  \uFF80  \u001C ``{\t\u001B\u001C\u001B \u001B`\t\uFFE0 \u001C\u001B  \u001B {{ \n{\n |\n\n\n\n\n\n\t\n{\n{\n{{\n\n\n\t\n{\n\n{\n\t\n{\n{\t\n{\n{\n{{\n\t\n{{{{{{{{{{{{{{{{\n{\n\n{\n{\n{{\n{{\t{{{\n\n{\n{\t\n{\n{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{\n{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{[                                                                                                                                                                                                    ";
        callMethod(klass, "swapCase", argTypes, null, args);
    }

};


