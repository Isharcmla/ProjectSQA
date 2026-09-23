package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CommandLineRunner_createExterns_185043600251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82529;
     Object term82895;

    public CommandLineRunner_createExterns_185043600251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82529 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term82635 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term82743 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term82853 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        setBooleanField(term82529, term82529.getClass(), "testMode", true);
        setBooleanField(term82635, term82635.getClass(), "initialized", false);
        setField(term82743, term82743.getClass(), "instance", null);
        setField(term82635, term82635.getClass(), "delegate", term82743);
        setField(term82635, term82635.getClass(), "value", null);
        setField(term82529, term82529.getClass(), "externsSupplierForTesting", term82635);
        setBooleanField(term82853, term82853.getClass(), "use_only_custom_externs", true);
        setField(term82529, term82529.getClass(), "flags", term82853);
        term82895 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term82896 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        Object term82897 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term82898 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setBooleanField(term82896, term82896.getClass(), "display_help", false);
        setBooleanField(term82896, term82896.getClass(), "print_tree", false);
        setBooleanField(term82896, term82896.getClass(), "compute_phase_ordering", false);
        setBooleanField(term82896, term82896.getClass(), "print_ast", false);
        setBooleanField(term82896, term82896.getClass(), "print_pass_graph", false);
        setField(term82896, term82896.getClass(), "jscomp_dev_mode", null);
        setField(term82896, term82896.getClass(), "logging_level", null);
        setField(term82896, term82896.getClass(), "externs", null);
        setField(term82896, term82896.getClass(), "js", null);
        setField(term82896, term82896.getClass(), "js_output_file", null);
        setField(term82896, term82896.getClass(), "module", null);
        setField(term82896, term82896.getClass(), "variable_map_input_file", null);
        setField(term82896, term82896.getClass(), "property_map_input_file", null);
        setField(term82896, term82896.getClass(), "variable_map_output_file", null);
        setBooleanField(term82896, term82896.getClass(), "create_name_map_files", false);
        setField(term82896, term82896.getClass(), "property_map_output_file", null);
        setBooleanField(term82896, term82896.getClass(), "third_party", false);
        setIntField(term82896, term82896.getClass(), "summary_detail_level", 0);
        setField(term82896, term82896.getClass(), "output_wrapper", null);
        setField(term82896, term82896.getClass(), "output_wrapper_marker", null);
        setField(term82896, term82896.getClass(), "module_wrapper", null);
        setField(term82896, term82896.getClass(), "module_output_path_prefix", null);
        setField(term82896, term82896.getClass(), "create_source_map", null);
        setField(term82896, term82896.getClass(), "jscomp_error", null);
        setField(term82896, term82896.getClass(), "jscomp_warning", null);
        setField(term82896, term82896.getClass(), "jscomp_off", null);
        setField(term82896, term82896.getClass(), "define", null);
        setField(term82896, term82896.getClass(), "charset", null);
        setField(term82896, term82896.getClass(), "compilation_level", null);
        setField(term82896, term82896.getClass(), "warning_level", null);
        setBooleanField(term82896, term82896.getClass(), "use_only_custom_externs", true);
        setBooleanField(term82896, term82896.getClass(), "debug", false);
        setField(term82896, term82896.getClass(), "formatting", null);
        setBooleanField(term82896, term82896.getClass(), "process_closure_primitives", false);
        setBooleanField(term82896, term82896.getClass(), "manage_closure_dependencies", false);
        setField(term82896, term82896.getClass(), "output_manifest", null);
        setField(term82895, term82895.getClass(), "flags", term82896);
        setBooleanField(term82895, term82895.getClass(), "isConfigValid", false);
        setField(term82895, term82895.getClass(), "config", null);
        setField(term82895, term82895.getClass(), "out", null);
        setField(term82895, term82895.getClass(), "err", null);
        setField(term82895, term82895.getClass(), "compiler", null);
        setField(term82895, term82895.getClass(), "inputCharset", null);
        setField(term82895, term82895.getClass(), "outputCharset", null);
        setBooleanField(term82895, term82895.getClass(), "testMode", true);
        setField(term82898, term82898.getClass(), "instance", null);
        setField(term82897, term82897.getClass(), "delegate", term82898);
        setBooleanField(term82897, term82897.getClass(), "initialized", true);
        setField(term82897, term82897.getClass(), "value", null);
        setField(term82895, term82895.getClass(), "externsSupplierForTesting", term82897);
        setField(term82895, term82895.getClass(), "inputsSupplierForTesting", null);
        setField(term82895, term82895.getClass(), "modulesSupplierForTesting", null);
        setField(term82895, term82895.getClass(), "exitCodeReceiverForTesting", null);
        setField(term82895, term82895.getClass(), "runTimeStats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createExterns", argTypes, term82529, args);
        assertTrue(recursiveEquals(term82529, term82895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


